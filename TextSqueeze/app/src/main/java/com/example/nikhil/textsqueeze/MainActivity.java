package com.example.nikhil.textsqueeze;
;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //String [] a = {" "};
    EditText editText;
    public final static String Data_Key = "com.example.nikhil.textsqueeze.data_key";
    public final static String Data_Key1 = "com.example.nikhil.textsqueeze.data_key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String data1 = intent.getStringExtra(Data_Key1);

        editText = (EditText) findViewById(R.id.Edtxt);
        editText.setText(data1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void ClearBtn(View views){
        editText = (EditText) findViewById(R.id.Edtxt);
        editText.setText(" ");
    }

    public  void SqueezeBtn(View views){
        editText = (EditText) findViewById(R.id.Edtxt);
        String data = editText.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);

        //Squeeze should happen here

        intent.putExtra(Data_Key, data);
        startActivity(intent);

    }

    public void CameraBtn(View views){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
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
}
