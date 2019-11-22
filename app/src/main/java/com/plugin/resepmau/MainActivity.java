package com.plugin.resepmau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.plugin.resepmau.Helper.BaseListResponse;
import com.plugin.resepmau.Network.ApiUtils;
import com.plugin.resepmau.Network.Tour;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tvTour;
    private Tour tour;
    private List<Tour> TourList;
    private Call<BaseListResponse<Tour>> call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        getData();
    }

    private void initViews() {
        tour = ApiUtils.getTourInterfaceService();
        tvTour = findViewById(R.id.tvTour);
    }

    private void getData() {
        call.enqueue(new Callback<BaseListResponse<Tour>>() {
            @Override
            public void onResponse(Call<BaseListResponse<Tour>> call, Response<BaseListResponse<Tour>> response) {
                if(response.isSuccessful()){
                    BaseListResponse basetour = response.body();
                    if(basetour.getStatus()){
                        System.out.println("ssts "+ basetour.getStatus());
                        if (basetour.getData().isEmpty()){
                            System.out.println("kosong "+ basetour.getData());
                        }else {
                            TourList = basetour.getData();
                            System.out.println("uwu "+ TourList);
                        }
                    }else {

                    }
                }else {

                }
            }

            @Override
            public void onFailure(Call<BaseListResponse<Tour>> call, Throwable t) {

            }
        });
    }
}
