package com.tony.ngeno.ridealong;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
