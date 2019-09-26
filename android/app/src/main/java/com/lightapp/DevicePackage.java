package com.lightapp;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.ViewManager;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

//This file just imports our module and instantiates it.
public class DevicePackage implements ReactPackage {
    @Nonnull
    @Override
    public List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactContext) {
        List<NativeModule> list = new ArrayList<>();
        // add different Native Modules to the list and then return the list
        list.add(new DeviceModule(reactContext));
        return list;
    }

    @Nonnull
    @Override
    public List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactContext) {
        return null;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules(){
        return new ArrayList<>();
    }
}

// This is the index.js or app.js code - we can access this module there
//import {NativeModules} from 'react-native';
//        NativeModules.Device.getDeviceName((err ,name) => {
//        console.log(err, name);
//        });