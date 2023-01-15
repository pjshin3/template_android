package philip.android.frame.repository

import kotlinx.coroutines.flow.Flow
import philip.android.frame.data.entity.Book

interface BookRepository {
    fun invoke(): Flow<Result<List<Book>>>
}