package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by chenxuguo on 23-9-28.
 */

public class HttpUtil {

    public static void sendOKHttpequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall((request)).enqueue(callback);
    }
}
