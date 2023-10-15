package com.example.api_exampls.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    public static RetrofitAPI getRetrofitManager(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://65.0.127.224/")
                // as we are sending data in json format so
                // we have to add Gson converter factory
                .addConverterFactory(GsonConverterFactory.create())
                // at last we are building our retrofit builder.
                .build();
        return retrofit.create(RetrofitAPI.class);
    }
}
