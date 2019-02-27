package com.example.newstesttask.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("name")
    @Expose
    private String name;

    public Source() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
