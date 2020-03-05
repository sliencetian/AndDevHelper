package com.anddev.helper.core;

import android.content.Context;

import com.anddev.helper.BuildConfig;

/**
 * Author silence.
 * Time：2020-03-05.
 * Desc：
 */
public class AndDevHelper {

    public static Context context = null;

    public static boolean isDebugMode(){
        return BuildConfig.DEBUG;
    }
}
