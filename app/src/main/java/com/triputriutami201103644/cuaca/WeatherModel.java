package com.triputriutami201103644.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherModel {
    private String main;
    private String description;
    private String icon;

    public WeatherModel(){
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}