package com.debajyotibasak.udacitybaking.di.modules;

import com.debajyotibasak.udacitybaking.view.ui.detail.DetailsActivity;
import com.debajyotibasak.udacitybaking.view.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = FragmentModule.class)
    abstract DetailsActivity contributeDetailsActivity();
}
