package com.example.nikhil.menuproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void Message(View view) {
        final Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + Uri.encode("2018500848")));
        intent.putExtra("sms_body", "Nikhil Londhe");
        startActivity(intent);
    }

    public void Call(View view) {
        final Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:2018500848"));
        startActivity(intent);
    }

    public void Web(View view) {
        final Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal8.pace.edu/cp/home/displaylogin"));
        startActivity(websiteIntent);
    }

    public void Map(View view) {
        String geoUri = String.format("geo:19.0760,72.8777");
        Uri geo = Uri.parse(geoUri);
        Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
        startActivity(geoMap);
    }

    public void Share(View view) {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        startActivity(Intent.createChooser(intent, "Share the love"));
    }

    public void Activity(View view) {
        final Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            if(id == R.id.action_help){
                final Intent intent = new Intent(this, HelpActivity.class);
                startActivity(intent);
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }
