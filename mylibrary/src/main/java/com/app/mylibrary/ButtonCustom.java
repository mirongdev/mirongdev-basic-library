package com.app.mylibrary;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

// Contoh kustom view ButtonCustom di Java
public class ButtonCustom extends AppCompatButton {
    public ButtonCustom(Context context) {
        super(context);
        init();
    }

    public ButtonCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Isi kode untuk mengatur tampilan dan gaya button custom di sini
        // Misalnya, ubah warna latar belakang, ukuran teks, dsb.

        // Mengubah latar belakang menjadi hijau
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.button_custom_background));

        // Mengubah warna teks menjadi putih
        setTextColor(Color.WHITE);

        // Mengatur jarak untuk teks dari batas button
        // Mengatur jarak untuk teks dari batas button
        int padding = 96;
        setPadding(padding, padding, padding, padding);

    }
}
