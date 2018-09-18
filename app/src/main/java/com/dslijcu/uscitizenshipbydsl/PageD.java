package com.dslijcu.uscitizenshipbydsl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PageD extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_d);
        myBrowser = (WebView)findViewById(R.id.webViewD);
        myBrowser.loadUrl("file:///android_asset/parteD.html");
    }
}
