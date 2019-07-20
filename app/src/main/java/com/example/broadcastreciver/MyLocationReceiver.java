package com.example.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

import static android.provider.Settings.Secure.ALLOWED_GEOLOCATION_ORIGINS;

public class MyLocationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().matches("android.location.PROVIDER_CHANGED")){
            ContentResolver contentResolver = context.getContentResolver();
            try {
                int mode = Settings.Secure.getInt(contentResolver, ALLOWED_GEOLOCATION_ORIGINS);
                String locationMode = "";




            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
