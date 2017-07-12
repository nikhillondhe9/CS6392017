package com.example.nikhil.statelistproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    public final static String Map_Key = "com.example.nikhil.statelistproject.map_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.stateList);
        String[] states = new String[]{"Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Idaho",
                "Illinois", "Indiana",
                "Iowa",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Maine",
                "Maryland",
                "Massachusetts",
                "Michigan",
                "Minnesota",
                "Mississippi",
                "Missouri",
                "Montana Nebraska",
                "Nevada",//26
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "New York",
                "North Carolina",
                "North Dakota",//32
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",//36
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Vermont",
                "Virginia",
                "Washington",
                "West Virginia",
                "Wisconsin",
                "Wyoming"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, states);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){

                    String[] State = {"32.361623", "-86.287686", "Alabama"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 26){

                    String[] State = {"39.162426", "-119.758846", "Nevada"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 27){

                    String[] State = {"43.207126", "-71.544949", "New Hampshire"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 28){

                    String[] State = {"40.217622", "-74.747412", "New Jersey"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 29){

                    String[] State = {"35.680641", "-105.958543", "New Mexico"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 30){

                    String[] State = {"40.712312", "-73.995052", "New York"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 31){

                    String[] State = {"35.788443", "-78.624370", "North Carolina"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }
                if (i == 32){

                    String[] State = {"46.810670", "-100.787540", "North Dakota"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }

                /*if (i == 32){

                    String[] State = {"32.361623", "-86.287686", "Pennsylvania"};
                    Intent intent = new Intent(view.getContext(), MapsActivity.class );
                    intent.putExtra(Map_Key, State);
                    startActivity(intent);
                }*/
            }
        });

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
