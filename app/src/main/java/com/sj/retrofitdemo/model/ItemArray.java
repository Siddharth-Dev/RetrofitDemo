package com.sj.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemArray {
    @SerializedName("item")
    @Expose
    private List<ItemList> item = null;

    public List<ItemList> getItem() {
        return item;
    }

    public void setItem(List<ItemList> item) {
        this.item = item;
    }
}