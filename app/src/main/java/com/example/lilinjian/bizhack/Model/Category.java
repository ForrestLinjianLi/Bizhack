package com.example.lilinjian.bizhack.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lilinjian on 24/03/2018.
 */


public class Category implements Serializable {
    private ArrayList<Category> categoryArrayList;
    private String categoryName;

    public Category(String name) {
        this.categoryArrayList = new ArrayList<Category>();
        this.categoryName = name;
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }

    public void addCategory(Category category){
        categoryArrayList.add(category);
    }

    public String getCategoryName() {
        return categoryName;
    }

}
