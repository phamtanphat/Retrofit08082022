package com.example.retrofit08082022;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pphat on 11/4/2022.
 */
public interface ApiService {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1DTO> getDemo1();

    @GET("KhoaPhamTraining/json/tien/demo2.json")
    Call<Demo2DTO> getDemo2();
}
