package com.example.me_tech.referrerrnd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.analytics.CampaignTrackingReceiver;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("YES", "IT WORKS!!");
        handleIntent(context, intent);
       // new CampaignTrackingReceiver().onReceive(context, intent);
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    // Handle the intent data
    public void handleIntent(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String referrerString = extras.getString("referrer");
        Log.d("YEES", "IT WORKS!!!" +referrerString);
    }
}
