package com.anddev.helper.log;

import com.anddev.helper.core.AndDevHelper;

/**
 * Author silence.
 * Time：2020-03-05.
 * Desc：
 */
public final class SLog {

    private static final String TAG = "AndDevHelper";

    private static boolean IS_DEBUG = AndDevHelper.isDebugMode();

    public static void d(String msg) {
        if (IS_DEBUG) {
            android.util.Log.d(TAG, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (IS_DEBUG) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void d(String tag, String format, Object... args) {
        if (IS_DEBUG) {
            String msg = String.format(format, args);
            android.util.Log.d(tag, msg);
        }
    }

    public static void e(String msg) {
        if (IS_DEBUG) {
            android.util.Log.e(TAG, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (IS_DEBUG) {
            android.util.Log.e(tag, msg);
        }
    }

    public static void e(String msg, Throwable tr) {
        if (IS_DEBUG) {
            android.util.Log.e(TAG, msg, tr);
        }
    }
    public static void e(String tag,String msg, Throwable tr) {
        if (IS_DEBUG) {
            android.util.Log.e(tag, msg, tr);
        }
    }

}
