package com.debajyotibasak.udacitybaking.di.modules;

import com.debajyotibasak.udacitybaking.view.ui.widget.RecipeIngredientsWidget;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BroadcastReceiverModule {

    @ContributesAndroidInjector
    abstract RecipeIngredientsWidget contributeRecipeIngredientsWidget();
}
