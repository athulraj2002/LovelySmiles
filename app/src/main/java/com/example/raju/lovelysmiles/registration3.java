package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class registration3 extends AppCompatActivity {
    Button paymentbtn;
    ImageButton r3bw;
    Intent r3int;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration3);

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

    }
}
