package com.example.welcome;

public class result {

    private String water_level;
    private String description;

    public result(String water_level,String description){
        this.water_level=water_level;
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

    public String getWaterLevel(){
        return water_level;
    }
}
