package com.example.raju.lovelysmiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class payment extends AppCompatActivity {
    LinearLayout ll1,ll2,ll3,ll4;
    private void noselect(){
        ll1.setBackground(getDrawable(R.drawable.noselect));
        ll2.setBackground(getDrawable(R.drawable.noselect));
        ll3.setBackground(getDrawable(R.drawable.noselect));
        ll4.setBackground(getDrawable(R.drawable.noselect));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ll1=(LinearLayout)findViewById(R.id.ll1);
        ll2=(LinearLayout)findViewById(R.id.ll2);
        ll3=(LinearLayout)findViewById(R.id.ll3);
        ll4=(LinearLayout)findViewById(R.id.ll4);

        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noselect();
                ll1.setBackground(getDrawable(R.drawable.border3));
            }
        });
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noselect();
                ll2.setBackground(getDrawable(R.drawable.border3));
            }
        });
        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noselect();
                ll3.setBackground(getDrawable(R.drawable.border3));
            }
        });
        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noselect();
                ll4.setBackground(getDrawable(R.drawable.border3));
            }
        });
    }
}
