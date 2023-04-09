package philip.android.frame.di

import androidx.room.Room
import com.google.gson.Gson
import org.koin.dsl.koinApplication
import org.koin.dsl.module
import philip.android.frame.MainApplication
import philip.android.frame.data.AppDataBase
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val databaseModule = module {
    single { Room
        .databaseBuilder(get(), AppDataBase::class.java, AppDataBase.DATABASE_NAME)
        .build()
    }
}
