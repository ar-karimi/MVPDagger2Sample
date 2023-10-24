package com.example.alireza.dagger2testapplication.di.module;

import com.example.alireza.dagger2testapplication.Model.Model;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    public Model provideModelClass() {
        return new Model();
    }
}
