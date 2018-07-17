package io.github.bayu1993.dagger2example

import android.app.Application
import io.github.bayu1993.dagger2example.di.component.AppComponent
import io.github.bayu1993.dagger2example.di.component.DaggerAppComponent
import io.github.bayu1993.dagger2example.di.module.AppsModule

class AppClass : Application(){

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appsModule(AppsModule())
                .build()
    }
    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}