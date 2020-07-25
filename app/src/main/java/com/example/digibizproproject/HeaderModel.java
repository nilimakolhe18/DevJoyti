package com.example.digibizproproject;

public class HeaderModel {

    int image;
    String text;

    HeaderModel (int image,String text){
        this.image = image;
        this.text = text;
    }
    public int getImage(){
        return image;
    }
    public String getText(){
        return text;
    }
}
