package com.plugin.resepmau.Model;

import com.google.gson.annotations.SerializedName;

public class ModelTour {

    @SerializedName("id") private int Id;
    @SerializedName("category") private String category;
    @SerializedName("image") private String image;
    @SerializedName("longitude") private String longitude;
    @SerializedName("latitude") private String latitude;
    @SerializedName("name") private String name;

    public ModelTour() {
    }

    public ModelTour(int id, String category, String image, String longitude, String latitude, String name) {
        Id = id;
        this.category = category;
        this.image = image;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
