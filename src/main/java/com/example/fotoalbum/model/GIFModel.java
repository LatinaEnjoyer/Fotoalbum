package com.example.fotoalbum.model;

public class GIFModel {

    private int id;
    private String image;
    private String text;

    public GIFModel(String image, String skinText){
        this.image = image;
        this.text = skinText;
    }

    public GIFModel(int id, String image, String text){
        this.id = id;
        this.image = image;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setText(String Text) {
        this.text = text;
    }
}
