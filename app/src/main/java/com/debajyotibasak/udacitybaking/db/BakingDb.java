package com.debajyotibasak.udacitybaking.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.debajyotibasak.udacitybaking.api.model.Recipe;
import com.debajyotibasak.udacitybaking.db.dao.RecipeDao;

@Database(entities = {Recipe.class}, version = 1, exportSchema = false)
public abstract class BakingDb extends RoomDatabase {

    private static volatile BakingDb INSTANCE;

    public abstract RecipeDao recipeDao();
}
