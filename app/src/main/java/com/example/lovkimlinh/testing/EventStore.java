package com.example.lovkimlinh.testing;

public class EventStore  {

   private String title;
    private String date;
    private String location;
    private String desc;
    private String imageurl;

    public EventStore(String title, String date, String location, String desc, String imageurl) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.desc = desc;
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }







}
