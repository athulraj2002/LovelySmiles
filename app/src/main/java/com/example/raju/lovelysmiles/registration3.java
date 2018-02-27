package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration3 extends AppCompatActivity {
    Button paymentbtn;
    Intent r3int;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration3);

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
