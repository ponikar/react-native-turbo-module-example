package com.reactnativedeviceinfo2;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.reactnativedeviceinfo2.codegen.NativeDeviceInfoSpec;

public class NativeDeviceInfo extends NativeDeviceInfoSpec {

    public static final String NAME = "DeviceInfoModule";
    public NativeDeviceInfo(ReactApplicationContext context) {
        super(context);
    }
    @Override
    public String getMacAddress() {
        return null;
    }

    @Override
    public boolean isEmulator() {
        return false;
    }

    @Override
    public String getIpAddress() {
        return null;
    }

    @Override
    public WritableMap getWifiInfo() {
        return null;
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }
}
