package com.lightapp;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.ViewManager;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

public class DevicePackage implements ReactPackage {
    @Nonnull
    @Override
    public List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactContext) {
        List<NativeModule> list = new ArrayList<>();
        // add different Native Modules to the list and then return the list
        list.add(new DeviceModule(reactContext));
        return null;
    }

    @Nonnull
    @Override
    public List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactContext) {
        return null;
    }
}
