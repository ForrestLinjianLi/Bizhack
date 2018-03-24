package com.example.lilinjian.bizhack.Parser;

import com.example.lilinjian.bizhack.Model.Category;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by lilinjian on 24/03/2018.
 */

public class CategoryParser {
    public static void parse(String jsonResponse)
            throws JSONException{
        JSONArray ja = new JSONArray(jsonResponse);

        for (int i=0; i<ja.length(); ++i){
            try {
                JSONObject jo = ja.getJSONObject(i);
                String name = jo.getString("name");
                Category c = new Category(name);

            }catch (JSONException e ){
                // do nothing
            }
        }
    }
}
