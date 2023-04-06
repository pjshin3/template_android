package philip.android.frame.domain

import androidx.lifecycle.ViewModel
import philip.android.frame.data.entity.Book
import philip.android.frame.repository.BookRepository

class BookUseCase(
    private val repo: BookRepository
): ViewModel() {
    fun invoke() = repo.invoke()
}