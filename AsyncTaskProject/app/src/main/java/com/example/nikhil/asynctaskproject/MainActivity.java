package com.example.nikhil.asynctaskproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ImageView imgV;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imgV = (ImageView) findViewById(R.id.imgv1);

        new fetchImage().execute();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class fetchImage extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
           try{

                bitmap  =   BitmapFactory.decodeStream((InputStream)new URL("https://raw.githubusercontent.com/nikhillondhe9/CS6392017/aaff90e3005001a850c78c5fbd4e82e8af216432/Mumbai.jpg").getContent());

            }catch (Exception e){
                Log.e("Image", "Failed to Load Image", e);
               Log.e("Error", e.getMessage());
            }
          /* try{
               URL url = new URL("http://s3.india.com/travel/wp-content/uploads/2016/01/marine-drive.jpg");
               HttpURLConnection    con = (HttpURLConnection)url.openConnection();
               if(con.getResponseCode() != 200){
                   throw new Exception("Failed to connect");
               }
               InputStream is = con.getInputStream();
               is.close();
               bitmap = BitmapFactory.decodeStream(is);
               return bitmap;

           }*/
            return null;

        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            imgV.setImageBitmap(bitmap);
        }
    }
}
