package com.example.lilinjian.bizhack.Model;

import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by joyce on 2018-03-24.
 */

public class CategoryManager implements Iterable<Category>{
    private Map<String, Category> CategoryMap;
    private static CategoryManager instance;


    @NonNull
    @Override
    public Iterator<Category> iterator() {
        return null;
    }
}
