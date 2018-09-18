package com.sj.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.sj.retrofitdemo.adapter.Item_Card_Adapter;
import com.sj.retrofitdemo.adapter.Item_User_Adapter;
import com.sj.retrofitdemo.model.ItemArray;
import com.sj.retrofitdemo.model.ItemList;
import com.sj.retrofitdemo.model.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView) RecyclerView recyclerView;
    @BindView(R.id.progressBar) ProgressBar progressBar;
    private List<ItemList> data;
    private Item_Card_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initViews();
    }

    private void initViews() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getDataFromServer2();
    }

    public void  getDataFromServer() {
        int i = 1;
        APIService service = ApiClient.getClient().create(APIService.class);

        Call<ItemArray> userCall = service.getItem(i);

        userCall.enqueue(new Callback<ItemArray>() {
            @Override
            public void onResponse(Call<ItemArray> call, Response<ItemArray> response) {
                if(response.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    data = response.body().getItem();
                    adapter = new Item_Card_Adapter(data);
                    recyclerView.setAdapter(adapter);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<ItemArray> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Log.d("onFailure", t.toString());
            }
        });
    }


    public void  getDataFromServer2() {
        APIService service = ApiClient.getClient().create(APIService.class);

        Call<List<User>> userCall = service.getItemList();

        userCall.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(response.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    recyclerView.setAdapter(new Item_User_Adapter(response.body()));
                } else {
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Log.d("onFailure", t.toString());
            }
        });
    }
}
