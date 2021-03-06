package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jaren Lynch on 7/21/2016.
 */
public class Earthquake {

    //Coordinates of quake
    private String mCoords;

    //Country of quake
    private String mCountry;

    //Magnitude of quake
    private String mMagnitude;

    //Date of quake
    private String mDate;

    //Time of quake
    private String mTime;

    //url for quake
    private String mURL;


    /**
     *
     * @param location is the location of the quake
     * @param magnitude is the magnitude of the quake
     * @param date is the date of the quake
     */

    public Earthquake(String location, String magnitude, Long date, String url) {
        String[] splitLocation = location.split("(?<= of )");

        //Check to see if coordinates and country are present in location. If not, will  only
        //populate view with present data. Prevents "ArrayIndexOutOfBoundsException"
        if (splitLocation.length > 1) {
            mCoords = splitLocation[0];
            mCountry = splitLocation[1];
        } else {
            mCountry = splitLocation[0];
            mCoords = "Unknown position in";
        }
        mMagnitude = magnitude;

        //Sets Long of parse time data to desired date format.
        Date dateObject = new Date(date);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE, MMM d, yyyy");
        mDate = dateFormatter.format(dateObject);


        //Sets Long of parse time data to desired time format.
        Date timeObject = new Date(date);
        SimpleDateFormat timeFormatter = new SimpleDateFormat("h:mm a");
        mTime = timeFormatter.format(timeObject);

        mURL = url;
    }

    /**
     * @return location of quake
     */
    public String getCoords() {

        return mCoords;
    }

    /**
     * @return country quake occurred
     */
    public String getCountry() {

        return mCountry;
    }

    /**
     * @return magnitude of the quake
     */
    public String getMagnitude() {

        return mMagnitude;
    }

    /**
     * @return date of the quake.
     */
    public String getDate() {

        return mDate;
    }

    /**
     * @return time of the quake
     */
    public String getTime() {
        return mTime;
    }

    /**
     * @return url for quake
     */
    public String getURL() {
        return mURL;
    }
}
