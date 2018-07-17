package io.github.bayu1993.dagger2example.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.bayu1993.dagger2example.AppClass
import io.github.bayu1993.dagger2example.R
import io.github.bayu1993.dagger2example.di.ActivityScope
import io.github.bayu1993.dagger2example.di.component.ActivityComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@ActivityScope
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.injectActivity()

        this.initView()
    }

    private fun initView() {
        btn_load.setOnClickListener {
            mainPresenter.getClubList()
        }
    }

    private fun injectActivity() {
        val injector: ActivityComponent = (applicationContext as AppClass).appComponent
                .activityComponent()
                .build()

        injector.inject(this)
    }
}
