package it.tempoluogo.app.location

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Entry point for Android geofence events.
 * The visit state machine will be implemented in the next V1 phase.
 */
class GeofenceBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // Phase 1 foundation: receiver registered and ready for geofence handling.
    }
}
