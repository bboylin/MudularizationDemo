package com.bboylin.mudularizationdemo;

import android.app.Application;

import com.github.mzule.activityrouter.annotation.Modules;

/**
 * Created by lin on 2017/3/31.
 */
@Modules({"app","MuduleA","ModuleB"})
public class ModularizationApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
