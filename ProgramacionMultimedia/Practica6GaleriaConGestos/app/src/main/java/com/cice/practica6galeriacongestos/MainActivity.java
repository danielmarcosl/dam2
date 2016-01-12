package com.cice.practica6galeriacongestos;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.R.integer;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity implements OnGesturePerformedListener {

	
	//GUI
	private ImageSwitcher switcher;
	private Button btnL;
	private Button btnR;
	
	//Logica de la aplicacion
	private int contador = -1; //control de imagen actual
	
	private int totalImagenes = 0; //Total de imagenes
	
	private ArrayList<Imagen> listaImagenes = new ArrayList<Imagen>();
	
	//Enum que guarda las direcciones para ir de una imagen a otra
	enum enumDirection {DERECHA,IZQUIERDA};
	enumDirection direction = enumDirection.DERECHA;
	
	//Para barra de progreso
	private ProgressDialog pDialog;
	public static final int progress_bar_type = 0;
	
	
	private GestureLibrary gestureLib; //aqui referencia al archivo de gestos
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main); //sin gestos

		
		//Prepara la pantalla para reconocer gestos.
		GestureOverlayView gestureOverlay = new GestureOverlayView(this);
		gestureOverlay.setGestureVisible(false);//quita la pintura del trazado de la linea
		
		View layoutInflate = getLayoutInflater().inflate(R.layout.activity_main, null);
		
		gestureOverlay.addView(layoutInflate);
		gestureOverlay.addOnGesturePerformedListener(this);//listener o delegate
		
		//pillamo la referencia al archivo de gestos
		gestureLib = GestureLibraries.fromRawResource(this, R.raw.gestures);
		gestureLib.load();

		
		setContentView(gestureOverlay);
		
		
		
		
		//Referencias a GUI
		switcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
		switcher.setFactory(new MyImageSwitcherFactory()); //preparamos el switcher

		btnL = (Button) findViewById(R.id.btnLeft);
		btnR = (Button) findViewById(R.id.btnRight);
		
		
		
		
		//Runnable para la descarga del XML (esto tb es un hilo)
		
		Runnable hiloXML = new Runnable() {
			
			Handler handler = new Handler();//este handler sirve para saber cuando acaba la tarea del Runnable
	
			
			@Override
			public void run() { //Tarea principal del hilo
				
				XmlPullParser contenidoXML = null;//aqui se vuelca el XML descargado
				
				HttpGet  urlXMl = new HttpGet("http://bishoport.com/android/imagenes.xml");
				DefaultHttpClient client = new DefaultHttpClient();
				
				try {
					HttpResponse execute = client.execute(urlXMl);//aqui inicia la conexion
					
					//inicializamos el objeto que va a contener el archivo descargado
					contenidoXML = XmlPullParserFactory.newInstance().newPullParser();
					InputStream content = execute.getEntity().getContent();
					contenidoXML.setInput(content,null);
					
					recorrerXML(contenidoXML);//si lanzamos este metodo desde aqui, el recorrido lo hace tb el hilo
					
				} catch (Exception e) {
					Log.i("myApp", "No hay conexion");
				}
				
				
				/*Este hilo secundario avisa al principal de que el Runnable ha terminado sus tareas
				puede comunicarse con la GUI principal*/
				handler.post(new Runnable() {
					@Override
					public void run() {
						Toast.makeText(MainActivity.this, "XML Preparado", Toast.LENGTH_LONG).show();
					}
				});
				
				
			}
		};
		
		
		//Esta linea siempre despues de la declaracion del Runnable
		new Thread(hiloXML).start();
	}
	
	
	
	
	
	
	//este metodo es llamado desde el Runnable una vez descargado el XML
	private void recorrerXML(XmlPullParser xmlDescargado) throws XmlPullParserException, IOException{
		
		int eventType = -1;
		
		while (eventType != XmlPullParser.END_DOCUMENT) {
			
			if(eventType == XmlPullParser.START_TAG){
				
				String tagName = xmlDescargado.getName();
				
				if(tagName.equals("imagen")){
					
					String tituloValue = xmlDescargado.getAttributeValue(null,"titulo");
					String urlValue = xmlDescargado.getAttributeValue(null,"url");
					
					Imagen myImagen = new Imagen(tituloValue, urlValue);
					listaImagenes.add(myImagen);
				}
				
			}
			eventType = xmlDescargado.next();
			//Log.i("myApp", "asdfa");
		}
		
		totalImagenes = listaImagenes.size(); //sacamos el numero de imagenes total, le preguntamos al Array	
	}
	
	
	
	private void ponerImagen(Drawable imagen){
		switcher.setImageDrawable(imagen);	
		
		btnL.setEnabled(true);
		btnR.setEnabled(true);
	}
	
	
	
	
	public void pulsaNavegacion(View v){
		
		btnL.setEnabled(false);
		btnR.setEnabled(false);
		
		//Obtenemos la id del boton pulsado
		int idPulsada = v.getId();
		
		if(idPulsada == R.id.btnLeft){
			contador -=1;
		}
		else if(idPulsada == R.id.btnRight){
			contador +=1;
		}
		
		if(contador < 0){//limite inferior
			contador = totalImagenes -1;
		}
		else if(contador > totalImagenes - 1){//limite superior
			contador = 0;
		}

		//Lanzamos el hilo de carga de la imagen
		DownloadImageTask imgDownloader = new DownloadImageTask();
		imgDownloader.execute(listaImagenes.get(contador).getUrl());
	
	}
	
	

	
	
	
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id, Bundle args) {
		
		
		switch (id) {
		case progress_bar_type:
			
			pDialog = new ProgressDialog(this);
			pDialog.setMessage("Descargando imagen, por favor espere...");
			pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			//pDialog.show();
			break;

		default:
			break;
		}

		return pDialog;
	}























	private class DownloadImageTask extends AsyncTask<String, integer, Drawable>{

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			showDialog(progress_bar_type);
		}

		@Override
		protected Drawable doInBackground(String... urls) {
			
			URL imageUrl; //url a descargar
			Drawable image = null; //lo que devuelve
			
			try {
				imageUrl = new URL(urls[0]);
				
				//comienza la descarga
				URLConnection conection = imageUrl.openConnection();
				conection.connect();
				
				InputStream stream = imageUrl.openStream();
				
				Bitmap bitmap = BitmapFactory.decodeStream(stream);
				image = new BitmapDrawable(getResources(), bitmap);
				
			} catch (Exception e) {
				// TODO: handle exception
			}

			return image;
		}
		
 
		@Override
		protected void onPostExecute(Drawable result) {
			super.onPostExecute(result);
			dismissDialog(progress_bar_type);
			ponerImagen(result);
		}
	
	}
	
	
	
	

	
	
	
	//Es un adapter que indica como van a salir los ImageView dentro de los paneles 
	//del ImageSwitcher
	private class MyImageSwitcherFactory implements ViewSwitcher.ViewFactory{

		@Override
		public View makeView() {
			
			ImageView imageView = (ImageView) 
					LayoutInflater.from(getApplicationContext()).inflate(R.layout.image_item, switcher,false);
			
			return imageView;
		}
	}






	@Override
	public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {
		
		
		
		ArrayList<Prediction> predictions = gestureLib.recognize(gesture);
		
		
		for (Prediction prediction : predictions) {
			
			Log.i("myApp","prediction: " + prediction.score);
			
			
			
			if(prediction.score > 1.0){

				String gesto = prediction.name;
				
				if(gesto.equals("slideRight")){
					
					
				}
				if(gesto.equals("slideLeft")){
					
					
				}
				if(gesto.equals("reload")){
					
					
				}
				
				Toast.makeText(this, gesto, Toast.LENGTH_LONG).show();
			}
			
			
		}
		
		
		
	}



}
