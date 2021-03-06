package com.debajyotibasak.udacitybaking.db.convertors;

import android.arch.persistence.room.TypeConverter;

import com.debajyotibasak.udacitybaking.api.model.Ingredient;
import com.debajyotibasak.udacitybaking.api.model.Recipe;
import com.debajyotibasak.udacitybaking.api.model.Step;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class StepConvertor {

    @TypeConverter
    public String fromIngredientList(List<Step> stepsList) {
        if (stepsList == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Step>>() {}.getType();
        return gson.toJson(stepsList, type);
    }

    @TypeConverter
    public List<Step> toIngredienList(String stepsList) {
        if (stepsList == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Step>>() {}.getType();
        return gson.fromJson(stepsList, type);
    }
}
