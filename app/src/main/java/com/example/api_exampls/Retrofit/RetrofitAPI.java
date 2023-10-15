package com.example.api_exampls.Retrofit;

import com.example.api_exampls.Post.model.PostResponceModel;
import com.example.api_exampls.model.CategoryResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET("api/getCategory")
    Call<CategoryResponseModel> getAllCategory();

    @GET("api/getPostByCategory/3")
    Call<PostResponceModel> getAllPost();
}
