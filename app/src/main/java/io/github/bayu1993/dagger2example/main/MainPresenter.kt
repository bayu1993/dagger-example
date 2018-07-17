package io.github.bayu1993.dagger2example.main

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonObject
import io.github.bayu1993.dagger2example.data.ApiService
import io.github.bayu1993.dagger2example.di.ActivityScope
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(val api: ApiService) {
    fun getClubList() {
        Log.d("Main Presenter", "Main Presenter : getClubList")
        api.getClubList().enqueue(object : Callback<JsonObject> {
            override fun onFailure(call: Call<JsonObject>?, t: Throwable?) {
                Log.e("MainPresenter", "Error ${t?.message}")
            }

            override fun onResponse(call: Call<JsonObject>?, response: Response<JsonObject>?) {
                Log.d("MainPresenter", "response ${Gson().toJsonTree(response)}")
            }

        })
    }

}

