package com.dslijcu.uscitizenshipbydsl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr);

        TextView tr = (TextView)findViewById(R.id.textView9);
        TextView tw = (TextView)findViewById(R.id.textView11);


        Bundle bundle = getIntent().getExtras();
        tr.setText(bundle.getString("TRIGHT"));
        tw.setText(bundle.getString("TWRONG"));
    }

    public void MoreInformation(View more){
        Intent info = new Intent(this, WPageParteOne.class);
        startActivity(info);
    }
}
