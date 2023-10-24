package com.example.alireza.dagger2testapplication.di.component;

import android.app.Application;
import android.content.Context;


import com.example.alireza.dagger2testapplication.InitApplication;
import com.example.alireza.dagger2testapplication.Model.Model;
import com.example.alireza.dagger2testapplication.di.module.AppModule;
import com.example.alireza.dagger2testapplication.di.module.ContextModule;
import com.example.alireza.dagger2testapplication.di.module.DataModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, ContextModule.class})
public interface AppComponent {
    void inject(InitApplication initApplication);

    Context getContext();

    Model getFindItemsInteractor();

    Application getApplication();
}

