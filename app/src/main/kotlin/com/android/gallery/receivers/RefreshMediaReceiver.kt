package com.android.gallery.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.android.gallery.helpers.REFRESH_PATH
import com.android.gallery.extensions.addPathToDB

class RefreshMediaReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val path = intent.getStringExtra(REFRESH_PATH) ?: return
        context.addPathToDB(path)
    }
}
