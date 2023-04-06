package philip.android.frame

import android.app.Application
import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.koinApplication
import org.koin.dsl.module
import philip.android.frame.di.databaseModule
import philip.android.frame.di.viewModelModule

class MainApplication: Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(listOf(
                databaseModule,
                viewModelModule))
        }
    }
}