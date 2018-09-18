package com.dslijcu.uscitizenshipbydsl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class pagef extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagef);

        myBrowser = (WebView)findViewById(R.id.webViewF);
        myBrowser.loadUrl("file:///android_asset/parteF.html");
    }
}
