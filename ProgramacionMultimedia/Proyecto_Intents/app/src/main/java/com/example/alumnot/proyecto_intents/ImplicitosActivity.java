package com.example.alumnot.proyecto_intents;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.util.Locale;

/**
 * Created by Daniel Marcos Lorrio on 15/10/15.
 */
public class ImplicitosActivity extends Activity {

    // Miembros de la clase
    private final int RC_SELECT_PHOTO = 1;
    private final int RC_TAKE_PHOTO = 2;

    // Para manejar las URI de las imagenes
    private String imagePath = null;

    /**
     * Metodo oncreate que mostrara el layout
     *
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicitos);
    }

    @Override
    /**
     * Metodo onPause que borrara la imagen al minimizar la aplicacion
     */
    protected void onPause() {
        super.onPause();

        if (imagePath != null) {
            Log.i("myApp", "onPause");
            File imgToDelete = new File(imagePath);
            imgToDelete.delete();
        }
    }

    /**
     * Metodo que se ejecutara cada vez que se pulse un boton
     * Create un nuevo Intent con una URI distinta segun el boton que se pulse
     *
     * @param v
     */
    public void lanzarActivity(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.verWeb:
                i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));
                startActivity(Intent.createChooser(i, "Select web app"));
                break;
            case R.id.verContactos:
                i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people/"));
                startActivity(i);
                break;
            case R.id.llamar:
                i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:657486789"));
                startActivity(i);
                break;
            case R.id.google:
                i = new Intent(Intent.ACTION_WEB_SEARCH);
                i.putExtra(SearchManager.QUERY, "android");
                startActivity(i);
                break;
            case R.id.mail:
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "asunto del corero");
                i.putExtra(Intent.EXTRA_TEXT, "cuerpo del mensaje");
                startActivity(Intent.createChooser(i, "Select email app"));
                break;
            case R.id.mapas:
                try {
                    Class.forName("com.google.android.maps.MapActivity"); // Comprobamos si el servicio de mapas está presente en el telefono, en principio todos los tienen

                    float latitud = 40.423806f;
                    float longitud = -3.670431f;
                    int zoom = 15;

                    String geoURI = String.format(Locale.US,
                            "geo:%f,%f=z=%d", latitud, longitud, zoom);

                    i = new Intent(Intent.ACTION_VIEW, Uri.parse(geoURI));

                    startActivity(i);
                } catch (Exception e) {
                    Toast toast = Toast.makeText(this,
                            "No tienes Google APIs",
                            Toast.LENGTH_LONG);
                    toast.show();

                    e.printStackTrace();
                }
                break;
            case R.id.galeria:
                i = new Intent(Intent.ACTION_PICK);
                i.setType("image/*");
                startActivityForResult(i, RC_SELECT_PHOTO);
                break;
            case R.id.camara:
                i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                imagePath = Environment.getExternalStorageDirectory().getAbsolutePath() +
                        "/tmp_image.jpg";
                File tmpFile = new File(imagePath);
                Uri uri = Uri.fromFile(tmpFile);
                i.putExtra(MediaStore.EXTRA_OUTPUT, uri);
                startActivityForResult(i, RC_TAKE_PHOTO);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RC_SELECT_PHOTO:
                if (resultCode == RESULT_OK) {
                    ImageView imageView = (ImageView) findViewById(R.id.contenedorImagen);
                    Uri imageUri = data.getData();
                    Bitmap galleryPick = scaleBitmap(getPathFromUri(imageUri), imageView.getHeight());

                    if (galleryPick != null) {
                        imageView.setImageBitmap(galleryPick);
                    } else {
                        Toast toast = Toast.makeText(this, "fallo al cargar la imagen", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                break;
            case RC_TAKE_PHOTO:
                if(resultCode == RESULT_OK) {
                    ImageView imageView = (ImageView) findViewById(R.id.contenedorImagen);

                }
                break;
        }
    }
}
