package com.example.lilinjian.bizhack.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.android.volley.RequestQueue;
import com.example.lilinjian.bizhack.Data.CategoryRecyclerViewAdaptor;
import com.example.lilinjian.bizhack.Model.Category;
import com.example.lilinjian.bizhack.R;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

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
        categoryRecyclerViewAdaptor = new CategoryRecyclerViewAdaptor(this,categories);
        recyclerView.setAdapter(categoryRecyclerViewAdaptor);
        categoryRecyclerViewAdaptor.notifyDataSetChanged();

        if (getIntent().getExtras() != null){
            Bundle subCategories = getIntent().getExtras();
            categories = (ArrayList)subCategories.getSerializable("documents");
        }
    }

    public ArrayList getCategories() {
        categories.clear();
        //TODO
        return categories;
    }



}
