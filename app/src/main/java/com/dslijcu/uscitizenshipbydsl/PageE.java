package com.dslijcu.uscitizenshipbydsl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PageE extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_e);

        myBrowser = (WebView)findViewById(R.id.webViewE);
        myBrowser.loadUrl("file:///android_asset/parteE.html");
    }
}
