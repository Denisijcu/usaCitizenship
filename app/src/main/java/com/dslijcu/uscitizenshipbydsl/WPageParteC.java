package com.dslijcu.uscitizenshipbydsl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WPageParteC extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpage_parte_c);
        myBrowser = (WebView)findViewById(R.id.webView2);
        myBrowser.loadUrl("file:///android_asset/parteC.html");
    }
}