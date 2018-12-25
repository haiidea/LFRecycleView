package me.leefeng.recycleviewdemo;

import android.util.Log;

public class LogUtil {
	private static boolean isShow = true;
	public static void showLog(String tag, String msg) {
		if(isShow)
			Log.i(tag, msg);
	}

	public static void showLog(String msg) {
		if(isShow)
			Log.e("llz", msg);
	}
}
