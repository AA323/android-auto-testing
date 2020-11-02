package com.aa323.automessageservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationManagerCompat;

import android.util.Log;

public class MessageReadReceiver extends BroadcastReceiver {
    private static final String TAG = MessageReadReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        if (AutoMessagingService.READ_ACTION.equals(intent.getAction())) {
            int conversationId = intent.getIntExtra(AutoMessagingService.CONVERSATION_ID, -1);
            if (conversationId != -1) {
                Log.d(TAG, "Conversation " + conversationId + " was read");
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
                notificationManager.cancel(conversationId);
            }
        }
    }
}