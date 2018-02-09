package com.example.joern.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Joern on 2018/02/07.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
