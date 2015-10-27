package com.example.alumnot.proyecto_intents;

import java.io.File;
import java.util.Locale;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.MediaStore.MediaColumns;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ImplicitosActivity extends Activity{

	
	//Miembros de la clase ()
	private final int RC_SELECT_PHOTO = 1;
	private final int RC_TAKE_PHOTO = 2;
	
	private String imagePath = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_implicitos);
	}

	
	
	@Override
	protected void onPause() {
		super.onPause();
		
		if(imagePath != null){
			Log.i("myApp","onPause");
			File imgToDelete = new File(imagePath);
			imgToDelete.delete();
		}
	}











	public void lanzarActivity(View v){
		
		Intent i;
		
		switch (v.getId()) {
		
		case R.id.verWeb:
			i = new Intent(Intent.ACTION_VIEW, 
					Uri.parse("http://www.google.com"));
			//startActivity(i);
			startActivity(Intent.createChooser(i, "Select web App"));
			break;
			
			
		case R.id.verContactos:	
			i = new Intent(Intent.ACTION_VIEW, 
					Uri.parse("content://contacts/people/"));
			startActivity(i);
			break;
			
		case R.id.llamar:	
			i = new Intent(Intent.ACTION_VIEW, 
					Uri.parse("tel:6574837475"));
			startActivity(i);
			break;
		
		case R.id.google:	
			i = new Intent(Intent.ACTION_WEB_SEARCH);
			
			i.putExtra(SearchManager.QUERY, "android");
			
			startActivity(i);
			
			break;
			
			
		case R.id.mail:	
			i = new Intent(Intent.ACTION_SEND);
			
			i.setType("message/rfc822"); //type MIME de los Mail
			
			//Array de strings que acumula los mail de destino
			i.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com"});
			i.putExtra(Intent.EXTRA_SUBJECT, "asunto del correo");
			i.putExtra(Intent.EXTRA_TEXT, "cuerpo del correo");
			
			//startActivity(i);
			startActivity(Intent.createChooser(i, "Select email App"));
			break;
			
			
			
		case R.id.mapas:
			
			try{
				//Pregunta si tiene instalado el sistema de google Maps
				//del paquete GOOGLE API�s
				Class.forName("com.google.android.maps.MapActivity");
				//Si esta linea da error, pasa directamente al catch
				
				float latitud = 40.423806f;
				float longitud = -3.670431f;
				int zoom = 15;
				
				String geoURI = String.format(Locale.US, 
						"geo:%f,%f?z=%d", latitud,longitud,zoom);
				
				i = new Intent(Intent.ACTION_VIEW, Uri.parse(geoURI));
				startActivity(i);
				
			}
			catch(Exception e){
				Toast toast = Toast.makeText(this, 
						"No tienes Google Apis", 
						Toast.LENGTH_LONG);
				toast.show();	
			}
			break;
			
			
		case R.id.galeria:
			i = new Intent(Intent.ACTION_PICK);
			i.setType("image/*");
			//startActivity(i);
			startActivityForResult(i, RC_SELECT_PHOTO);
			
			break;
		
			
			
		case R.id.camara:
			
			i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			
			imagePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tmp_image.jpg"; //fichero temporal
			
			File tmpFile = new File(imagePath);
			
			Uri uri = Uri.fromFile(tmpFile);
			
			i.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, uri);

			//startActivity(i);
			startActivityForResult(i, RC_TAKE_PHOTO);
			
			break;
		}
	}

	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
		
		case RC_SELECT_PHOTO:
			if(resultCode == RESULT_OK){ //RESULT_OK -> es un ENUM
			
				ImageView imageView = (ImageView) findViewById(R.id.contenedorImagen);
				
				Uri imageUri = data.getData();
				
				//Log.i("myApp", getPathFromUri(imageUri));
				
				Bitmap galleryPick = scaleBitmap( getPathFromUri(imageUri), imageView.getHeight());
				
				if(galleryPick != null){
					imageView.setImageBitmap(galleryPick);
				}
				else{
					Toast toast = Toast.makeText(this, "fallo al cargar la imagen", Toast.LENGTH_LONG);
					toast.show();
				}
			}
			
			break;
			
			
		case RC_TAKE_PHOTO:
			if(resultCode == RESULT_OK){ //RESULT_OK -> es un ENUM
				
				ImageView imageView = (ImageView) findViewById(R.id.contenedorImagen);
				
				Bitmap cameraPick = scaleBitmap(imagePath, imageView.getHeight());
				
				if(cameraPick != null){
					imageView.setImageBitmap(cameraPick);
				}
				else{
					Toast toast = Toast.makeText(this, "fallo al cargar la imagen", Toast.LENGTH_LONG);
					toast.show();
				}
				
			}
			break;
		}
	}
	
	
	
	
	
	
	
	
	//Este metodo convierte una URI generada por el provider MediaStore (base de datos SQL de archivos multimedia)
	//pj: content://media/external/images/media/13 en un path del sistema de ficheros normal
	
	private String getPathFromUri(Uri uri){
		
		String path = "";
		
		String[] projection = {MediaColumns.DATA};
		Cursor cursor = getContentResolver().query(uri,projection,null,null,null);
		
		try{
			int column_index = cursor.getColumnIndexOrThrow(MediaColumns.DATA);
			if(cursor.moveToFirst()){
				path = cursor.getString(column_index);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		cursor.close();
		
		return path;
	}
	
	
	
	private Bitmap scaleBitmap(String imagePath, int maxDimension){
		
		Bitmap scaledBitmap; //aqui va la copia de la imagen reescalada

		//--ANALIZAMOS LA IMAGEN
		
		//Clase que tiene utilidades para trabajar con bitmaps
		BitmapFactory.Options op = new BitmapFactory.Options();
		op.inJustDecodeBounds = true; //solo calcula las dimensiones, no carga el bitmap
		
		scaledBitmap = BitmapFactory.decodeFile(imagePath,op);

		
		//--PREPARAMOS LA PROXIMA ESCALA
		
		if((maxDimension < op.outHeight) || (maxDimension < op.outWidth)){
			op.inSampleSize = Math.round(Math.max((float) op.outHeight / (float) maxDimension, 
					(float) op.outWidth / (float) maxDimension));
			//Usamos Math.max porque es mejor que la imagen sea un poco mayor que el ImageView
			//Ya que si es menor, la agrandara para ajustarla y se podria pixelar
		}
		
		//--APLICAMOS LA NUEVA ESCALA
		
		op.inJustDecodeBounds = false; //aqui si carga el  bitmap
		
		scaledBitmap = BitmapFactory.decodeFile(imagePath,op);
	
		return scaledBitmap;
	}





	
	
	
	
	
	
	
	
	


}
