package com.example.lilinjian.bizhack.Data;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lilinjian.bizhack.Activities.CategoryActivity;
import com.example.lilinjian.bizhack.Model.Category;
import com.example.lilinjian.bizhack.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilinjian on 24/03/2018.
 */

public class CategoryRecyclerViewAdaptor extends RecyclerView.Adapter<CategoryRecyclerViewAdaptor.ViewHolder>{
    public Context context;
    public List<Category> categories;

    public CategoryRecyclerViewAdaptor(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public CategoryRecyclerViewAdaptor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_row, parent);

        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(CategoryRecyclerViewAdaptor.ViewHolder holder, int position) {
        Category category = categories.get(position);
        holder.category.setText(category.getCategoryName());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView category;

        public ViewHolder(View itemView,Context ctx) {
            super(itemView);
            context = ctx;
            category = itemView.findViewById(R.id.categoryTextViewID);
            category.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ArrayList subcategories = categories.get(getAdapterPosition()).getCategoryArrayList();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("documents", subcategories);
                    Intent intent = new Intent(context, CategoryActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            });
        }

        @Override
        public void onClick(View view) {

        }
    }
}
