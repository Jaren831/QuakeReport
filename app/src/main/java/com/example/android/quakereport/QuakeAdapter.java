package com.example.android.quakereport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
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

        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTextView.getBackground();
        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(currentQuake.getMagnitude());

        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);

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
        System.out.print(magnitudeColor);
        return listItemView;
    }
    public int getMagnitudeColor(String magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(Double.parseDouble(magnitude));

        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
