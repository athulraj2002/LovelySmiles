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
    public LinearLayout p1,p2,p3,p4,t1,t2,t3,t4;
    public ImageButton bw,fw;
    Intent r1int;
    private void packselect(){
        p1.setBackground(getDrawable(R.drawable.border1));
        p2.setBackground(getDrawable(R.drawable.border1));
        p3.setBackground(getDrawable(R.drawable.border1));
        p4.setBackground(getDrawable(R.drawable.border1));

        t1.setBackground(getDrawable(R.drawable.empty));
        t2.setBackground(getDrawable(R.drawable.empty));
        t3.setBackground(getDrawable(R.drawable.empty));
        t4.setBackground(getDrawable(R.drawable.empty));
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

        t1=findViewById(R.id.tick1);
        t2=findViewById(R.id.tick2);
        t3=findViewById(R.id.tick3);
        t4=findViewById(R.id.tick4);

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
        p1.setBackground(getDrawable(R.drawable.border3));

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p1.setBackground(getDrawable(R.drawable.border3));
                t1.setBackground(getDrawable(R.drawable.tick));

            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p2.setBackground(getDrawable(R.drawable.border3));
                t2.setBackground(getDrawable(R.drawable.tick));
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p3.setBackground(getDrawable(R.drawable.border3));
                t3.setBackground(getDrawable(R.drawable.tick));

            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packselect();
                p4.setBackground(getDrawable(R.drawable.border3));
                t4.setBackground(getDrawable(R.drawable.tick));
            }
        });
    }
}