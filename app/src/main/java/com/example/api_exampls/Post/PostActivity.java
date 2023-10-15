package com.example.api_exampls.Post;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.api_exampls.Adapter.NextPageAdapter;
import com.example.api_exampls.NextPageActivity;
import com.example.api_exampls.Post.Adapter.PostAdapter;
import com.example.api_exampls.Post.model.Post;
import com.example.api_exampls.Post.model.PostResponceModel;
import com.example.api_exampls.Retrofit.RetrofitAPI;
import com.example.api_exampls.Retrofit.RetrofitManager;
import com.example.api_exampls.databinding.ActivityPostBinding;
import com.example.api_exampls.model.CategoryResponseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostActivity extends AppCompatActivity {

    private @NonNull ActivityPostBinding binding;

    List<Post>postList = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getAllPost();
    }

    private void getAllPost() {
        RetrofitAPI retrofitAPI = RetrofitManager.getRetrofitManager();
        retrofitAPI.getAllPost().enqueue(new Callback<PostResponceModel>() {
            @Override
            public void onResponse(Call<PostResponceModel> call, Response<PostResponceModel> response) {
              PostResponceModel postResponceModel = response.body();
                postList = postResponceModel.getData();
                PostAdapter postAdapter = new PostAdapter(postList);
                LinearLayoutManager linearLayoutManager = new GridLayoutManager(PostActivity.this,3);
                binding.postId.setLayoutManager(linearLayoutManager);
                binding.postId.setHasFixedSize(true);
                binding.postId.setAdapter(postAdapter);


                Log.d("Successed","Data coming"+postList);
            }

            @Override
            public void onFailure(Call<PostResponceModel> call, Throwable t) {
                Log.d("Fail to load ","Data Not coming"+ t.getMessage());

            }
        });
    }


}
