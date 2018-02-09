package com.example.joern.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Joern on 2018/02/07.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public  String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
