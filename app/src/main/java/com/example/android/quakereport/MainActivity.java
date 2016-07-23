package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jaren Lynch on 7/21/2016.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quake_list);

        // Create a fake list of earthquakes.
        ArrayList<Quake> earthquakes = QueryUtils.extractEarthquakes();


        //Creates a QuakeAdapter whose data source is a list of quakes. Creates list items
        //for each item in list.
        QuakeAdapter adapter = new QuakeAdapter(this, earthquakes);

        //Find the ListView in the view hierarchy.
        ListView listView = (ListView) findViewById(R.id.quake_list);

        //Sets list view to the data organized by the adapter.
        listView.setAdapter(adapter);
    }
}
