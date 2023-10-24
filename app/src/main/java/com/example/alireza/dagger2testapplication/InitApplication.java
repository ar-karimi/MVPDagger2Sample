
package com.example.alireza.dagger2testapplication;

import android.app.Application;
import android.content.Context;

import com.example.alireza.dagger2testapplication.di.component.AppComponent;
import com.example.alireza.dagger2testapplication.di.component.DaggerAppComponent;
import com.example.alireza.dagger2testapplication.di.module.AppModule;
import com.example.alireza.dagger2testapplication.di.module.ContextModule;
import com.example.alireza.dagger2testapplication.di.module.DataModule;


public class InitApplication extends Application {

    private AppComponent component;

    public static InitApplication get(Context context) {
        return (InitApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .contextModule(new ContextModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent component() {
        return component;
    }
}
