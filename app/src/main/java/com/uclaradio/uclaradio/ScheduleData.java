package com.uclaradio.uclaradio;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tanzeelakhan on 4/1/17.
 */

public class ScheduleData {

    @SerializedName("username")
    private String username;

    @SerializedName("title")
    private String title;

    @SerializedName("time")
    private String time;

    @SerializedName("day")
    private String day;


    @SerializedName("genre")
    private String genre;


    public String getUsername() {
        return username;
    }

    public String getTitle(){
        return title;
    }

    public String getTime(){
        return time;
    }

    public String getDay(){
        return day;
    }

    public String getGenre(){
        return genre;
    }


}