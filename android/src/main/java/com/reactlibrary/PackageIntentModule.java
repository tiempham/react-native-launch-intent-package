package com.reactlibrary;


import android.content.Intent;
import android.content.pm.PackageManager;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class PackageIntentModule extends ReactContextBaseJavaModule {

    public PackageIntentModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void startIntent(String packageName) {
        Intent intent = getIntent(packageName);
        if (intent != null) {
            getReactApplicationContext().startActivity(intent);
        }
    }

    @ReactMethod
    public void canStartIntent(String packageName, Callback callback) {
        Intent intent = getIntent(packageName);
        callback.invoke(intent != null);
    }

    private Intent getIntent(String packageName) {
        PackageManager pm = getReactApplicationContext().getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage(packageName);
        return intent;
    }

    @Override
    public String getName() {
        return "PackageIntentAndroid";
    }
}
