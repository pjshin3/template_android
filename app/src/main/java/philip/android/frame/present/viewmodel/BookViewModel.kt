package philip.android.frame.present.viewmodel

import philip.android.frame.domain.BookUseCase

class BookViewModel (
    private val bookUseCase: BookUseCase
): BaseViewModel() {
    fun getBookList() = bookUseCase.invoke()
}