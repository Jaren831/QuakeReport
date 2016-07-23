package com.example.android.quakereport;

/**
 * Created by Jaren Lynch on 7/21/2016.
 */
public class Quake {

    //Location of quake
    private String mLocation;

    //Magnitude of quake
    private String mMagnitude;

    //Date of quake
    private String mDate;


    /**
     *
     * @param location is the location of the quake
     * @param magnitude is the magnitude of the quake
     * @param date is the date of the quake
     */
    public Quake(String location, String magnitude, String date) {
        mLocation = location;
        mMagnitude = magnitude;
        mDate = date;
    }

    /**
     * @return location of quake
     */
    public String getLocation() {
        return mLocation;
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
}
