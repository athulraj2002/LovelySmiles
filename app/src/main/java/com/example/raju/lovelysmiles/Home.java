package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
   public Button hmbtn;
    public Intent hmint;
   // LinearLayout pll1,pll2,pll3;
    //ImageButton p1,p2,p3;
   /* private void allgone(){
        pll1.setVisibility(LinearLayout.GONE);
        pll2.setVisibility(LinearLayout.GONE);
        pll2.setVisibility(LinearLayout.GONE);

        p1.setBackgroundResource(R.drawable.plus_24px);
        p2.setBackgroundResource(R.drawable.plus_24px);
        p3.setBackgroundResource(R.drawable.plus_24px);

    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       /* pll1=(LinearLayout)findViewById(R.id.pll1);
        pll2=(LinearLayout)findViewById(R.id.pll2);
        pll3=(LinearLayout)findViewById(R.id.pll3);

        p1=(ImageButton)findViewById(R.id.p1);
        p2=(ImageButton)findViewById(R.id.p2);
        p3=(ImageButton)findViewById(R.id.p3);


        pll2.setVisibility(LinearLayout.GONE);
        p2.setBackgroundResource(R.drawable.plus_24px);
        pll3.setVisibility(LinearLayout.GONE);
        p3.setBackgroundResource(R.drawable.plus_24px);


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgone();
                p1.setBackgroundResource(R.drawable.minus_24px);
                pll1.setVisibility(View.VISIBLE);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgone();
                p2.setBackgroundResource(R.drawable.minus_24px);
                pll2.setVisibility(View.VISIBLE);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgone();
                p3.setBackgroundResource(R.drawable.minus_24px);
                pll3.setVisibility(View.VISIBLE);
            }
        }); */

      hmint=new Intent(Home.this,Registration1.class);
        hmbtn=(Button) findViewById(R.id.homebtn);
       hmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(hmint);
            }
        });
    }
}









