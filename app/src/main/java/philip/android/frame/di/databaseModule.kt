package philip.android.frame.di

import androidx.room.Room
import org.koin.dsl.koinApplication
import org.koin.dsl.module
import philip.android.frame.MainApplication
import philip.android.frame.data.AppDataBase

val databaseModule = module {
    single { Room
        .databaseBuilder(get(), AppDataBase::class.java, AppDataBase.DATABASE_NAME)
        .build() }
}