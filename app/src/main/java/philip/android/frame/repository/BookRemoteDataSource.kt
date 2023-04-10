package philip.android.frame.repository

import android.util.Log
import com.google.gson.JsonArray
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
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

    data class Post(
        val id : String = "",
        var userId: String = "",
        var title : String = "",
        var body: String = ""
    )

    interface PostApiService{
        @GET("posts")
        fun getPosts(): Single<List<Post>>

    }

    fun getPostsRemoteData() {
        retrofit.create(PostApiService::class.java)
            .getPosts()
            .subscribeOn(Schedulers.io())
            .map {
                Log.e("philip", "테스트 입니다 = ${it.size}")
            }
            .onErrorReturn { t ->
                Log.e("philip","실패 = $t")
            }
            .map {

            }
            .subscribe()
    }
}