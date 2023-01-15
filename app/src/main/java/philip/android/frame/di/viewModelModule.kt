package philip.android.frame.di

import androidx.lifecycle.viewmodel.viewModelFactory
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.get
import philip.android.frame.domain.BookUseCase
import philip.android.frame.present.viewmodel.BookViewModel
import philip.android.frame.repository.BookLocalDataSource
import philip.android.frame.repository.BookRemoteDataSource
import philip.android.frame.repository.BookRepository
import philip.android.frame.repository.BookRepositoryImpl

val viewModelModule = module {
    single { BookUseCase(get() as BookRepository) }
    single { BookRepositoryImpl(get(BookRemoteDataSource::class.java), get(BookLocalDataSource::class.java))
    viewModelFactory { BookViewModel(get(BookUseCase::class.java)) } }
}