package com.m90.badshahandicappertips.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit2;

    //private static final String BASE_URL = "http://badsha.cricketnewshub.xyz/public/api/";
      private static final String BASE_URL = "http://badsha.avistore.in/public/api/";


    public static Retrofit getRetrofitInstanceServer() {
        if (retrofit2 == null) {
            retrofit2 = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit2;
    }




}
