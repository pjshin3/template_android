package philip.android.frame.data

import androidx.room.Database
import androidx.room.RoomDatabase
import philip.android.frame.data.entity.Book
import philip.android.frame.data.entity.BookDao

@Database(entities = [Book::class], version = 0)
abstract class AppDataBase: RoomDatabase() {

    companion object {
        val DATABASE_NAME = "MAIN_DATABASE"
    }

    abstract fun getBookDao(): BookDao
}

