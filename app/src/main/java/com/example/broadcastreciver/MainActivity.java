package com.example.broadcastreciver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int GET_ALARAM = 0x021;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSetAlarm(View view) {
        //using intent to contact with any component of the app
        Intent intent = new Intent(this,MyReceiver.class);
        //PendingIntent is an intent which can allow a forien app to use our application permission,
        // to execute a set of predefined code
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this.getApplicationContext(),
                GET_ALARAM,intent,
                0);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        alarmManager.set(AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis()+5000,
                pendingIntent);
    }
}
