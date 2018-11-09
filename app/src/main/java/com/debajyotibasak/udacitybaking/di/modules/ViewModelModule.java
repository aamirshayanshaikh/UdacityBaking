package com.debajyotibasak.udacitybaking.di.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.debajyotibasak.udacitybaking.di.interfaces.ViewModelKey;
import com.debajyotibasak.udacitybaking.factory.ViewModelFactory;
import com.debajyotibasak.udacitybaking.view.ui.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel mainViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
