package com.lightapp;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
//import com.esri.android.map.MapView;
import javax.annotation.Nonnull;

public class ArcGisModule extends ReactContextBaseJavaModule {

//    private MapView.
    public ArcGisModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return "ArcGIS screen";
    }

    // we can try to show a toast saying arcGIS maps working
    public void showToast(Callback cb){
        try {
            cb.invoke(null, "");
        }catch (Exception e){
            cb.invoke(null, e);
        }
    }

    // we can initialize the ArcGIS map here and then show it maybe
    // we can call this by NativeModules.showMap() or something
    // where to do we put the UI for a service?
    public void showMap(){

    }


}
