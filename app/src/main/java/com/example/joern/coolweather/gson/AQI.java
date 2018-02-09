package com.example.joern.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Joern on 2018/02/07.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
