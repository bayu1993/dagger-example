package io.github.bayu1993.dagger2example.di.component

import dagger.Component
import io.github.bayu1993.dagger2example.AppClass
import io.github.bayu1993.dagger2example.di.module.AppsModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppsModule::class])
interface AppComponent{
    fun activityComponent(): ActivityComponent.Builder
    fun inject(appClass: AppClass)
}