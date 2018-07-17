package io.github.bayu1993.dagger2example.di.component

import dagger.Subcomponent
import io.github.bayu1993.dagger2example.main.MainActivity
import io.github.bayu1993.dagger2example.di.ActivityScope

@ActivityScope
@Subcomponent
interface ActivityComponent{
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build():ActivityComponent
    }


}