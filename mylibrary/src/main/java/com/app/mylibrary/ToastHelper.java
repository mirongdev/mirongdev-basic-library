package com.app.mylibrary;

import android.content.Context;
import android.widget.Toast;

// Contoh kelas ToastHelper dalam Java
public class ToastHelper {
    private static Toast currentToast;

    public static void alertToast(Context context, String message) {
        if (currentToast != null) {
            currentToast.cancel();
        }
        currentToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        currentToast.show();
    }



}
