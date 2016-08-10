package com.example.admin.myapplication;

/**
 * Created by Admin on 2016/8/10.
 */
public class Fruit {
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    private String fruitName;
    private int imageId;

}
