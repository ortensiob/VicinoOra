package it.tempoluogo.app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface PlaceDao {
    @Query("SELECT * FROM places ORDER BY name")
    fun observeAll(): Flow<List<Place>>

    @Query("SELECT * FROM places WHERE enabled = 1")
    suspend fun getEnabled(): List<Place>

    @Insert
    suspend fun insert(place: Place): Long

    @Update
    suspend fun update(place: Place)

    @Query("DELETE FROM places WHERE id = :id")
    suspend fun delete(id: Long)
}
