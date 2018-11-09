package com.debajyotibasak.udacitybaking.di.component;

import android.app.Application;

import com.debajyotibasak.udacitybaking.BakingApp;
import com.debajyotibasak.udacitybaking.di.modules.ActivityModule;
import com.debajyotibasak.udacitybaking.di.modules.AppModule;
import com.debajyotibasak.udacitybaking.di.modules.BroadcastReceiverModule;
import com.debajyotibasak.udacitybaking.di.modules.ServiceModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules =
        {
                ActivityModule.class,
                AppModule.class,
                ServiceModule.class,
                BroadcastReceiverModule.class,
                AndroidSupportInjectionModule.class
        }
)
interface AppComponent extends AndroidInjector<BakingApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
