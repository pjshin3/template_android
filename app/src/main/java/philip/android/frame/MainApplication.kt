package philip.android.frame

import android.app.Application
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.koinApplication
import org.koin.dsl.module
import philip.android.frame.di.viewModelModule

class MainApplication: Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            koinApplication {
                modules(listOf(viewModelModule))
            }
        }
    }
}