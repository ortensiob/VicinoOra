package it.tempoluogo.app.location

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Foreground location service foundation.
 * Continuous/background tracking logic will be added in the geofencing phase.
 */
class TrackingService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null
}
