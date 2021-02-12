package com.example.databindingonfragmentandrecyclerview;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class Contact {
    private String name;
    private String phone;
    private int photo;

    public Contact() {
    }

    public Contact(String name, String phone, int photo) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", photo=" + photo +
                '}';
    }

    @BindingAdapter("android:loadImage")
    public static void setImagetoView (ImageView imageView, int photo){
        //Picasso.get().load(photo).into(imageView);
        imageView.setImageResource(photo);

    }
}
