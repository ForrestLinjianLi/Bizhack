package com.example.lilinjian.bizhack.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.example.lilinjian.bizhack.Data.CategoryRecyclerViewAdaptor;
import com.example.lilinjian.bizhack.Model.Category;
import com.example.lilinjian.bizhack.Parser.CategoryParser;
import com.example.lilinjian.bizhack.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList categories;
    private CategoryRecyclerViewAdaptor categoryRecyclerViewAdaptor;
    private RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });



        recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        categories = new ArrayList<>();
        categories = getCategories();
        if (getIntent().getExtras() != null){
            Bundle subCategories = getIntent().getExtras();
            categories = (ArrayList)subCategories.getSerializable("documents");
        }
        categoryRecyclerViewAdaptor = new CategoryRecyclerViewAdaptor(this,categories);
        recyclerView.setAdapter(categoryRecyclerViewAdaptor);
        categoryRecyclerViewAdaptor.notifyDataSetChanged();


    }

    public ArrayList getCategories() {
        categories.clear();
        Category category_1 = new Category("category_1");
        Category category_2 = new Category("category_2");
        Category category_3 = new Category("category_3");
        Category category_4 = new Category("category_4");
        Category category_5 = new Category("category_5");
        Category category_6 = new Category("category_7");
        Category category_7 = new Category("category_8");
        Category category_8 = new Category("category_9");
        category_1.addCategory(category_2);
        category_2.addCategory(category_3);
        category_2.addCategory(category_4);
        ArrayList a = new ArrayList();
        a.add(category_1);
        a.add(category_5);
        a.add(category_6);
        a.add(category_7);
        a.add(category_8);

        //TODO
        CategoryParser categoryParser = new CategoryParser();
        String url = "https://bizhacks.bbycastatic.ca/mobile-si/si/catalog?lang=en";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try{
                    JSONArray moviesArray = response.getJSONArray("Search");

                    for (int i = 0; i < moviesArray.length(); i++) {

                        JSONObject movieObj = moviesArray.getJSONObject(i);

                        Category category = new Category();

                        categories.add(category);


                    }

        return a;
    }



}
