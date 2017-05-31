package com.reactlibrary;


import android.content.Intent;
import android.content.pm.PackageManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class PackageIntentModule extends ReactContextBaseJavaModule {

    public PackageIntentModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void startIntent(String packageName) {
        PackageManager pm = getReactApplicationContext().getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage(packageName);
        if (intent != null) {
            getReactApplicationContext().startActivity(intent);
        }
    }

    @Override
    public String getName() {
        return "PackageIntentAndroid";
    }
}
