package com.sj.retrofitdemo;

import com.sj.retrofitdemo.model.ItemArray;
import com.sj.retrofitdemo.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {

 @FormUrlEncoded
 @POST("GetItem.php")
 Call<ItemArray> getItem(@Field("Retailer_Id")int Retailer_Id);

 @GET("posts")
 Call<List<User>> getItemList();
}