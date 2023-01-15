package philip.android.frame.data.entity

import androidx.room.*

@Entity(tableName = "BOOT_TABLE")
data class Book(
    @PrimaryKey
    val id : String = ""
)

@Dao
interface BookDao{
    @Query("SELECT * FROM boot_table")
    fun getBooks(): List<Book>
    @Insert
    fun inset(item: Book)
}