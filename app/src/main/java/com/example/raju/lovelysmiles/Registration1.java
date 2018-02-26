package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Registration1 extends AppCompatActivity {
    public LinearLayout p1,p2,p3,p4;
    public ImageButton bw,fw;
    Intent r1int;
    private void packselect(){
        p1.setBackground(getDrawable(R.drawable.border1));
        p2.setBackground(getDrawable(R.drawable.border1));
        p3.setBackground(getDrawable(R.drawable.border1));
        p4.setBackground(getDrawable(R.drawable.border1));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration1);

        r1int=new Intent(Registration1.this,Registration2.class);
        bw=(ImageButton)findViewById(R.id.r1finish);
        fw=(ImageButton)findViewById(R.id.r1next);
        p1=(LinearLayout)findViewById(R.id.pack1);
        p2=(LinearLayout)findViewById(R.id.pack2);
        p3=(LinearLayout)findViewById(R.id.pack3);
        p4=(LinearLayout)findViewById(R.id.pack4);

        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        fw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(r1int);
            }
        });

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p1.setBackground(getDrawable(R.drawable.border3));

            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p2.setBackground(getDrawable(R.drawable.border3));
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p3.setBackground(getDrawable(R.drawable.border3));

            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p4.setBackground(getDrawable(R.drawable.border3));
            }
        });
    }
}