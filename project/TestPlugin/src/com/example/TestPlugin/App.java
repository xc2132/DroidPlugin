package com.example.TestPlugin;

import android.content.Context;

import com.morgoo.droidplugin.*;
import com.morgoo.droidplugin.pm.PluginManager;

public class App extends PluginApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        PluginManager.STUB_AUTHORITY_NAME = BuildConfig.APPLICATION_ID;
        PluginManager.IGNORE_CUSTOM_PERMISSION = true;
        super.attachBaseContext(base);
    }
}
