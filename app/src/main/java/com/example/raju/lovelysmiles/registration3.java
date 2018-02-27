package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class registration3 extends AppCompatActivity {
    Button paymentbtn;
    ImageButton r3bw;
    Intent r3int;
    LinearLayout l1,l2,l3,l4;
    private void noitem(){
        l1.setBackground(getDrawable(R.drawable.noselect));
        l2.setBackground(getDrawable(R.drawable.noselect));
        l3.setBackground(getDrawable(R.drawable.noselect));
        l4.setBackground(getDrawable(R.drawable.noselect));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration3);

        l1=(LinearLayout)findViewById(R.id.l1);
        l2=(LinearLayout)findViewById(R.id.l2);
        l3=(LinearLayout)findViewById(R.id.l3);
        l4=(LinearLayout)findViewById(R.id.l4);


        r3bw=(ImageButton)findViewById(R.id.r3bw);
        r3bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        paymentbtn=(Button)findViewById(R.id.buttton_pay);
        r3int=new Intent(registration3.this, payment.class);
        paymentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(r3int);
            }
        });

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l1.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 600.00");
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l2.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 660.00");
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l3.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 690.00");
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l4.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 700.00");
            }
        });

    }
}
