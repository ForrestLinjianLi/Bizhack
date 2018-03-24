package com.example.lilinjian.bizhack.Model;

import android.os.Parcelable;
import android.provider.CalendarContract;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lilinjian on 24/03/2018.
 */

public class Category implements Serializable{
    private ArrayList<Category> categoryArrayList;
    private String categoryName;

    public Category() {
        this.categoryArrayList = new ArrayList<Category>();
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
