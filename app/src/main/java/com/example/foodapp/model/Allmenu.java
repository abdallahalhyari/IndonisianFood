
package com.rajendra.foodapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Allmenu {

    String name;
    String price;
    Integer imageUrl;
    String rating;
    String restorantname;
    public Allmenu(String name, String price, Integer imageUrl, String rating) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.restorantname = restorantname;
    }



    public String getRating() {
        return rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }


    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

}
