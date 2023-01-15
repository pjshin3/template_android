package philip.android.frame.domain

import kotlinx.coroutines.flow.Flow


interface BaseUseCase<T> {
    fun invoke(): Flow<Result<T>>
}