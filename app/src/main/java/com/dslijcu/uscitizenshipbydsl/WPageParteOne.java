package com.dslijcu.uscitizenshipbydsl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class WPageParteOne extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpage_parte_one);
        myBrowser = (WebView)findViewById(R.id.MywebView);

        myBrowser.loadUrl("file:///android_asset/partone.html");
    }
}
