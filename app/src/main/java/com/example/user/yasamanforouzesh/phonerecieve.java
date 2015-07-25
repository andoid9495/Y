package com.example.user.yasamanforouzesh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;

/**
 * Created by User on 7/15/2015.
 */
public class phonerecieve extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extra=intent.getExtras();
        if (extra!=null){
            String state=extra.getString(TelephonyManager.EXTRA_STATE);
            if (extra.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phonenumber=extra.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);

            }
        }
    }
}
