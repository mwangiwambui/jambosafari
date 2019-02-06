package com.example.wambui.jambosafari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about extends AppCompatActivity {
WebView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        a=(WebView)findViewById(R.id.web);

        a.loadUrl("file:///android_asset/index.html");

    }
}
