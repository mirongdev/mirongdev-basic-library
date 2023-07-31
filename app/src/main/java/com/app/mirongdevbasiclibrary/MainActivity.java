package com.app.mirongdevbasiclibrary;

import static com.app.mylibrary.ToastHelper.alertToast;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.app.mylibrary.ButtonCustom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// Contoh penggunaan di Java
        ButtonCustom buttonCustom = new ButtonCustom(this);
        buttonCustom.setText("Button Custom");
// Tambahkan buttonCustom ke tampilan Anda


    }

    public void test(View view) {
        // Contoh penggunaan di Java
        alertToast(this, "Ini adalah pesan dari library!");
    }
}