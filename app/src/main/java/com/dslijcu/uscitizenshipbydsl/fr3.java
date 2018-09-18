package com.dslijcu.uscitizenshipbydsl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dslijcu.uscitizenshipbydsl.R;
import com.dslijcu.uscitizenshipbydsl.WPagePart2;

public class fr3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr3);

        TextView tr = (TextView)findViewById(R.id.textView9);
        TextView tw = (TextView)findViewById(R.id.textView11);


        Bundle bundle = getIntent().getExtras();
        tr.setText(bundle.getString("TRIGHT"));
        tw.setText(bundle.getString("TWRONG"));

    }

    public void MoreInformation(View more){
        Intent info = new Intent(this, WPagePart2.class);
        startActivity(info);
    }
}
