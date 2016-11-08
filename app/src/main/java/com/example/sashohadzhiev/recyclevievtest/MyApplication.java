package com.example.sashohadzhiev.recyclevievtest;

import android.app.Application;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumPushService;
import com.leanplum.annotations.Parser;

/**
 * Created by sashohadzhiev on 11/7/16.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {

        Leanplum.setApplicationContext(this);
        Parser.parseVariables(this);
        LeanplumActivityHelper.enableLifecycleCallbacks(this);
        super.onCreate();

        // Insert here your App Leanplum keys
        if (BuildConfig.DEBUG) {
            Leanplum.setAppIdForDevelopmentMode("app_dIn7qaBPrBIE5xq1GO7GowlBgMemNasK6066CO2kxSU", "dev_5Sop9pPGjIN4hBCvGDRs6Ub4CRj1ArlJ7bloOh8mfZk");
        } else {
            Leanplum.setAppIdForProductionMode("app_dIn7qaBPrBIE5xq1GO7GowlBgMemNasK6066CO2kxSU", "prod_Gu8K0fUoR87ipifgDgvly58xxGEO033XrxdFEZ9rAnI");
        }

        Leanplum.allowInterfaceEditing();
        LeanplumPushService.setGcmSenderId(LeanplumPushService.LEANPLUM_SENDER_ID);
        Leanplum.start(this);

    }
}


