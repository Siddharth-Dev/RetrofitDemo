package com.sj.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemList {
    @SerializedName("Item_Id")
    @Expose
    private String itemId;
    @SerializedName("Item_Name")
    @Expose
    private String itemName;
    @SerializedName("Item_Description")
    @Expose
    private String itemDescription;
    @SerializedName("Item_Price")
    @Expose
    private String itemPrice;
    @SerializedName("Discount")
    @Expose
    private String discount;
    @SerializedName("Item_Image")
    @Expose
    private String itemImage;
    @SerializedName("First_Name")
    @Expose
    private String firstName;
    @SerializedName("Last_Name")
    @Expose
    private String lastName;
    @SerializedName("Mobile")
    @Expose
    private String mobile;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}