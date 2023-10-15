package com.example.api_exampls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.example.api_exampls.Adapter.NextPageAdapter;
import com.example.api_exampls.Retrofit.RetrofitAPI;
import com.example.api_exampls.Retrofit.RetrofitManager;
import com.example.api_exampls.databinding.ActivityNextPageBinding;
import com.example.api_exampls.model.Category;
import com.example.api_exampls.model.CategoryResponseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NextPageActivity extends AppCompatActivity {

        ActivityNextPageBinding binding;
        List<Category>categoryList = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityNextPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getAllCategory();
        
    }

    private void getAllCategory() {
        RetrofitAPI retrofitAPI = RetrofitManager.getRetrofitManager();
        retrofitAPI.getAllCategory().enqueue(new Callback<CategoryResponseModel>() {
            @Override
            public void onResponse(Call<CategoryResponseModel> call, Response<CategoryResponseModel> response) {
                CategoryResponseModel categoryResponseModel = response.body();
                categoryList = categoryResponseModel.getCategory();
                NextPageAdapter nextPageAdapter = new NextPageAdapter(categoryList);
                LinearLayoutManager linearLayoutManager = new GridLayoutManager(NextPageActivity.this,3);
                binding.nextRV.setLayoutManager(linearLayoutManager);
                binding.nextRV.setHasFixedSize(true);
                binding.nextRV.setAdapter(nextPageAdapter);


                Log.d("Successed","Data coming"+categoryList);
            }

            @Override
            public void onFailure(Call<CategoryResponseModel> call, Throwable t) {
                Log.d("ErrorTest",""+t.getMessage());
            }
        });

    }
}