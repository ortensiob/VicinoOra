package it.tempoluogo.app.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "visits")
data class Visit(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val placeId: Long,
    val entryTime: Long,
    val exitTime: Long? = null,
    val status: String = STATUS_ACTIVE
) {
    companion object {
        const val STATUS_ACTIVE = "ACTIVE"
        const val STATUS_COMPLETED = "COMPLETED"
        const val STATUS_MANUAL = "MANUAL"
    }
}
