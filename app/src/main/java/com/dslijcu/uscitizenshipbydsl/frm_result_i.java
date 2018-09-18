package com.dslijcu.uscitizenshipbydsl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class frm_result_i extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_result_i);

        TextView tr = (TextView)findViewById(R.id.textView9);
        TextView tw = (TextView)findViewById(R.id.textView11);


        Bundle bundle = getIntent().getExtras();
        tr.setText(bundle.getString("TRIGHT"));
        tw.setText(bundle.getString("TWRONG"));
    }

    public void MoreInfA(View moreA){
        Intent info = new Intent(this, pagei.class);
        startActivity(info);
    }
}
