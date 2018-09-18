package com.dslijcu.uscitizenshipbydsl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WPageParteD extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpage_parte_d);
        myBrowser = (WebView)findViewById(R.id.webView2);
        myBrowser.loadUrl("file:///android_asset/parteC.html");
    }
}
