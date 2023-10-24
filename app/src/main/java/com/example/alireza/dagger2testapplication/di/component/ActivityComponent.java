package com.example.alireza.dagger2testapplication.di.component;

import com.example.alireza.dagger2testapplication.MainContract;
import com.example.alireza.dagger2testapplication.View.MainActivity;
import com.example.alireza.dagger2testapplication.di.module.MvpModule;
import com.example.alireza.dagger2testapplication.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MvpModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    MainContract.PresenterCallBack getMainPresenter();
}
