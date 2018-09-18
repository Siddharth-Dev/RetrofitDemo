package com.sj.retrofitdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sj.retrofitdemo.R;
import com.sj.retrofitdemo.model.ItemList;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Item_Card_Adapter  extends RecyclerView.Adapter<Item_Card_Adapter.ViewHolder> {

    //List to store all items
    List<ItemList> items;

    //Constructor of this class
    public Item_Card_Adapter(List<ItemList> items){
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
    public void onBindViewHolder(Item_Card_Adapter.ViewHolder holder, int position) {
        holder.itemName.setText(items.get(position).getItemName());
        holder.itemDesc.setText(items.get(position).getItemDescription());
        holder.itemPrice.setText(items.get(position).getItemPrice());
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