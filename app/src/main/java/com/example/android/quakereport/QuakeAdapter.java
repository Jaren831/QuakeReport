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

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.quake_location);
        locationTextView.setText(currentQuake.getLocation());

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(currentQuake.getMagnitude());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.quake_date);
        dateTextView.setText(currentQuake.getDate());

        return listItemView;
    }
}
