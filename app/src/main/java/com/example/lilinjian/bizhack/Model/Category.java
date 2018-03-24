package com.example.lilinjian.bizhack.Model;

import java.util.ArrayList;

/**
 * Created by lilinjian on 24/03/2018.
 */

<<<<<<< HEAD
public class Category implements Serializable{
    private ArrayList<Category> categoryArrayList;
    private String categoryName;

    public Category(String name) {
        this.categoryArrayList = new ArrayList<Category>();
        this.categoryName = name;
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }
=======
public class Category {
    private String name;
>>>>>>> 34416c001d4296cdc7949354ff7a263ed8dc27f9

    public Category(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public void addCategory(Category category){
        categoryArrayList.add(category);
    }

    public String getCategoryName() {
        return categoryName;
    }
=======
>>>>>>> 34416c001d4296cdc7949354ff7a263ed8dc27f9
}
