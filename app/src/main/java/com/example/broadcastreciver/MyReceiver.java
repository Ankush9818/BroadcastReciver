package com.example.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    //this method is called when an event is occured to notify user about the specific event
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Time is reached ", Toast.LENGTH_LONG).show();
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
         vibrator.vibrate(2000);
    }
}
