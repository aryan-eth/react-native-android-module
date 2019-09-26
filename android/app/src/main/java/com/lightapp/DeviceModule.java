package com.lightapp;

import android.telecom.Call;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

//com.facebook.react.bridge.NativeModule - this was implemented
class DeviceModule extends ReactContextBaseJavaModule {
    public DeviceModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Device";
    }

    @ReactMethod
    public void getDeviceName(Callback cb) {
        try{
            cb.invoke(null, android.os.Build.MODEL);
        }catch (Exception e){
            cb.invoke(e.toString(), null);
        }
    }

    /* This is when we implement com.facebook.react.bridge.NativeModule
//    @Nonnull
//    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    public void initialize() {
//
//    }
//
//    @Override
//    public boolean canOverrideExistingModule() {
//        return false;
//    }
//
//    @Override
//    public void onCatalystInstanceDestroy() {
//
//    }
     */
}
