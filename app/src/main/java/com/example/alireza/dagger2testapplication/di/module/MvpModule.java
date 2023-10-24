package com.example.alireza.dagger2testapplication.di.module;


import com.example.alireza.dagger2testapplication.MainContract;
import com.example.alireza.dagger2testapplication.Model.Model;
import com.example.alireza.dagger2testapplication.Presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {

    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack providePresenter(MainContract.ViewCallBack view, Model model) {
        return new MainPresenterImpl(view, model);
    }
}
