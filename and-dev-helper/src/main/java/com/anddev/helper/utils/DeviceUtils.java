package com.anddev.helper.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;

import com.anddev.helper.core.AndDevHelper;
import com.anddev.helper.log.SLog;

import java.net.URLEncoder;

/**
 * Author silence.
 * Time：2020-03-05.
 * Desc：设备相关信息工具类
 */
public final class DeviceUtils {

    private static final String TAG = "DeviceUtils";

    private static final String UN_KNOW = "un-know";

    private static String mImei = null;

    @SuppressLint("MissingPermission")
    public static synchronized String getImei() {
        if (mImei != null){
            return mImei;
        }
        try {
            TelephonyManager tm = (TelephonyManager) AndDevHelper.context
                    .getSystemService(Context.TELEPHONY_SERVICE);
            mImei = tm.getDeviceId();
        } catch (Exception e) {
            SLog.e(TAG, "imei obtained exception", e);
            mImei = null;
        }
        return mImei;
    }

    /**
     * 获取当前操作系统版本
     *
     * @return 操作系统版本
     */
    public static String getOsVersion() {
        try {
            String osVersion = URLEncoder.encode(android.os.Build.VERSION.RELEASE, "utf-8");
            return osVersion == null ? "-1" : osVersion;
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }

    /**
     * 获取手机型号
     *
     * @return 手机型号
     */
    public static String getModel() {
        String model;
        try {
            model = android.os.Build.MODEL;
        } catch (Exception e) {
            model = "-1";
        }
        return model == null ? "-1" : model;
    }

    /**
     * 获取手机厂商
     *
     * @return 手机厂商
     */
    public static String getBrand() {
        String brand;
        try {
            brand = android.os.Build.BRAND;
        } catch (Exception e) {
            brand = "-1";
        }
        return brand == null ? "-1" : brand;
    }

}
