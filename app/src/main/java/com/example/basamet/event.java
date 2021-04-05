package com.example.basamet;

public class event {

private String title,location,price;
private int img;
    public event(String title, String location,String price,int img) {
        this.title = title;
        this.location = location;
        this.price=price;
        this.img=img;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    public int getImg() {
        return img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
