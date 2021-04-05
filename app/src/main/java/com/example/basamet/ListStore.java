package com.example.basamet;

public class ListStore {

    private String title2;
    private int price ;
    private int image1;

    public ListStore(String title2, int price, int image) {
        this.title2 = title2;
        this.price = price;
        this.image1 = image1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage(int image) {
        this.image1= image;
    }
}
