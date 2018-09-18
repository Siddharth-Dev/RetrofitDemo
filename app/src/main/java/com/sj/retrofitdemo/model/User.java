package com.sj.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("userId")
    String userId;

    @SerializedName("title")
    String title;

    @SerializedName("body")
    String body;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
