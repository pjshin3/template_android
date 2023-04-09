package philip.android.frame.repository

import android.util.Log
import com.google.gson.JsonArray
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.*
import retrofit2.http.GET

class BookRemoteDataSource(
    val retrofit: Retrofit
) {
    interface PostApiService{
        @GET("posts")
        fun getPosts(): Call<JsonArray>

    }

    fun getPostsRemoteData() {
        retrofit.create(PostApiService::class.java)
            .getPosts()
            .enqueue(object : Callback<JsonArray>{
                override fun onResponse(call: Call<JsonArray>, response: Response<JsonArray>) {
                    val data = response.body()
                }

                override fun onFailure(call: Call<JsonArray>, t: Throwable) {

                }
            })
    }
}