package com.plugin.resepmau.Network;

import com.plugin.resepmau.Helper.BaseListResponse;
import com.plugin.resepmau.Model.ModelTour;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Tour {

    @GET("tours")
    Call<BaseListResponse<ModelTour>> getTour();

}
