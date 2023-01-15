package philip.android.frame.domain

import philip.android.frame.data.entity.Book
import philip.android.frame.repository.BookRepository

class BookUseCase(
    private val repo: BookRepository
){
    fun invoke() = repo.invoke()
}