package com.dslijcu.uscitizenshipbydsl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class pagei extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagei);
      //  Toast.makeText(this,"La pagina de G.html",Toast.LENGTH_LONG).show();
        myBrowser = (WebView)findViewById(R.id.webViewI);
        myBrowser.loadUrl("file:///android_asset/parteI.html");
    }
}
