package com.dslijcu.uscitizenshipbydsl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class pageg extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageg);

        myBrowser = (WebView)findViewById(R.id.webViewG);
        myBrowser.loadUrl("file:///android_asset/parteH.html");
    }
}
