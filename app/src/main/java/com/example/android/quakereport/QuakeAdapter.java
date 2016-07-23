package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaren Lynch on 7/21/2016.
 */
public class QuakeAdapter extends ArrayAdapter<Quake>{
    public QuakeAdapter(Context context, ArrayList<Quake> quakes) {
        super(context, 0, quakes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Quake currentQuake = getItem(position);

        //Find the TextView with id magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the current quake
        magnitudeTextView.setText(currentQuake.getMagnitude());

        //Find the textView with id coords
        TextView coordsTextView = (TextView) listItemView.findViewById(R.id.coordinates);
        //Display the location of the current quake
        coordsTextView.setText(currentQuake.getCoords());

        //Find the textView with id country
        TextView countryTextView = (TextView) listItemView.findViewById(R.id.country);
        //Display the location of the current quake
        countryTextView.setText(currentQuake.getCountry());

        //Find the textView with id date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        //Display the date of the current quake
        dateTextView.setText(currentQuake.getDate());

        //Find the textView with id time
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
        //Display the date of the current quake
        timeTextView.setText(currentQuake.getTime());

        return listItemView;
    }
}
