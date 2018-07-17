package io.github.bayu1993.dagger2example.data

import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET
import java.util.concurrent.Callable

interface ApiService {
    @GET("opendatajson/football.json/master/2017-18/es.1.clubs.json")
            fun getClubList(): Call<JsonObject>

}