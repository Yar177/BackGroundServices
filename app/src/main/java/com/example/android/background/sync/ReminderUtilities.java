package com.example.android.background.sync;

import android.content.Context;
import android.support.annotation.NonNull;

import java.util.concurrent.TimeUnit;

/**
 * Created by 10190270 on 6/22/2018.
 */

public class ReminderUtilities {
    private static final int REMINDER_INTERVAL_MINUTES = 15;
    private static final int REMINDER_INTERVAL_SECONDS = (int) (TimeUnit.MINUTES.toSeconds(REMINDER_INTERVAL_MINUTES));
    private static final int SYNC_FLEXTIME_SECONDS = REMINDER_INTERVAL_SECONDS;

    private static final String REMINDER_JOB_TAG = "hydration_reminder_tag";

    private static boolean sInitializes;

    synchronized static void scheduleChargingReminder(@NonNull final Context context){

    }




}
