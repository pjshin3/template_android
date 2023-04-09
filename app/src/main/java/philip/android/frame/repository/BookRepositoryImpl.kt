package philip.android.frame.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import philip.android.frame.data.entity.Book

class BookRepositoryImpl(
    private val remoteDataSource: BookRemoteDataSource,
    private val localDataSource: BookLocalDataSource
): BookRepository {
    override fun invoke(): Flow<Result<List<Book>>> = flow {
        remoteDataSource.getPostsRemoteData()

        emit(Result.success(arrayListOf(Book("1234"))))
    }
}