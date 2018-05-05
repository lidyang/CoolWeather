package com.coolweather.android.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ldy on 18/5/3.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callBack){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callBack);

    }

}
