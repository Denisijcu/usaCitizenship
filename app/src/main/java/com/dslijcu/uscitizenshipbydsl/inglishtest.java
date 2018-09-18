package com.dslijcu.uscitizenshipbydsl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class inglishtest extends AppCompatActivity {
    WebView myBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inglishtest);

        myBrowser = (WebView)findViewById(R.id.webViewEnglish);
        myBrowser.loadUrl("file:///android_asset/SpeakingPortion.html");
    }
}
