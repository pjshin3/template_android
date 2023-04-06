package philip.android.frame.present.viewmodel

import androidx.lifecycle.ViewModel
import philip.android.frame.domain.BookUseCase

class BookViewModel (
    private val bookUseCase: BookUseCase
): ViewModel() {
    fun getBookList() = bookUseCase.invoke()
}