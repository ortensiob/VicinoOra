package it.tempoluogo.app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface VisitDao {
    @Query("SELECT * FROM visits ORDER BY entryTime DESC")
    fun observeAll(): Flow<List<Visit>>

    @Query("SELECT * FROM visits WHERE status = 'ACTIVE' LIMIT 1")
    suspend fun getActive(): Visit?

    @Insert
    suspend fun insert(visit: Visit): Long

    @Query("UPDATE visits SET exitTime = :exitTime, status = :status WHERE id = :id")
    suspend fun close(id: Long, exitTime: Long, status: String = Visit.STATUS_COMPLETED)

    @Query("SELECT * FROM visits WHERE entryTime < :end AND (exitTime IS NULL OR exitTime > :start) ORDER BY entryTime")
    suspend fun between(start: Long, end: Long): List<Visit>
}
