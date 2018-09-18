package com.sj.retrofitdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sj.retrofitdemo.R;
import com.sj.retrofitdemo.model.ItemList;
import com.sj.retrofitdemo.model.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Item_User_Adapter extends RecyclerView.Adapter<Item_User_Adapter.ViewHolder> {

    //List to store all items
    List<User> items;

    //Constructor of this class
    public Item_User_Adapter(List<User> items){
        super();
        //Getting all items
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Item_User_Adapter.ViewHolder holder, int position) {
        holder.itemName.setText(items.get(position).getUserId());
        holder.itemDesc.setText(items.get(position).getTitle());
        holder.itemPrice.setText(items.get(position).getBody());
    }

    @Override
    public int getItemCount() {return items.size();}

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ItemName) TextView itemName;
        @BindView(R.id.ItemDesc) TextView itemDesc;
        @BindView(R.id.ItemPrice) TextView itemPrice;

        //Initializing Views
        public ViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}