package com.plugin.resepmau.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtils {
    public static final String ENDPOINT = "https://dolang-apps.herokuapp.com/";
    private static final String BASE_URL = "https://dolang-apps.herokuapp.com/api/";
    private static Retrofit retrofit;

    private static Retrofit getApiClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Tour getTourInterfaceService(){
        return getApiClient().create(Tour.class);
    }



}

