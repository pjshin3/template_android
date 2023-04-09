package philip.android.frame.di

import androidx.lifecycle.viewmodel.viewModelFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import philip.android.frame.domain.BookUseCase
import philip.android.frame.present.viewmodel.BookViewModel
import philip.android.frame.repository.BookLocalDataSource
import philip.android.frame.repository.BookRemoteDataSource
import philip.android.frame.repository.BookRepository
import philip.android.frame.repository.BookRepositoryImpl

val viewModelModule = module {
    viewModel { BookViewModel(get()) }
    single { BookUseCase(get(BookRepositoryImpl::class) as BookRepository) }
    single { BookRepositoryImpl(get(), get())}
    single { BookRemoteDataSource(get()) }
    single { BookLocalDataSource() }
}