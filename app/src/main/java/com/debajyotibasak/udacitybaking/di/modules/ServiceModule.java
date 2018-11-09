package com.debajyotibasak.udacitybaking.di.modules;

import com.debajyotibasak.udacitybaking.view.ui.widget.IngredientsListWidgetService;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ServiceModule {

    @ContributesAndroidInjector
    abstract IngredientsListWidgetService contributeIngredientsListWidgetService();
}
