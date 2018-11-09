package com.debajyotibasak.udacitybaking.di.modules;

import com.debajyotibasak.udacitybaking.view.ui.detail.StepDetailsFragment;
import com.debajyotibasak.udacitybaking.view.ui.detail.StepListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract StepListFragment contributeStepListFragment();

    @ContributesAndroidInjector
    abstract StepDetailsFragment contributeStepDetailsFragment();
}
