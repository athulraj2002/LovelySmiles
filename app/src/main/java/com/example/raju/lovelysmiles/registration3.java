package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class registration3 extends AppCompatActivity {
    Button paymentbtn;
    ImageButton r3bw;
    Intent r3int;
    TextView loc1,loc2,loc3,loc4;
    String location;
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
        loc1=findViewById(R.id.loc1);
        loc2=findViewById(R.id.loc2);
        loc3=findViewById(R.id.loc3);
        loc4=findViewById(R.id.loc4);
        Bundle bundle=getIntent().getExtras();
        location=loc1.getText().toString();
        r3bw=(ImageButton)findViewById(R.id.r3bw);
        r3bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        paymentbtn=(Button)findViewById(R.id.buttton_pay);
        r3int=new Intent(registration3.this, payment.class);

        r3int.putExtra("date",bundle.getString("date"));
        r3int.putExtra("time",bundle.getString("time"));
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
                location=loc1.getText().toString();
                r3int.putExtra("location",location);

            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l2.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 660.00");
                location=loc2.getText().toString();
                r3int.putExtra("location",location);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l3.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 690.00");
                location=loc3.getText().toString();
                r3int.putExtra("location",location);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noitem();
                l4.setBackground(getDrawable(R.drawable.border4));
                paymentbtn.setText("PAY RS 700.00");
                location=loc4.getText().toString();
                r3int.putExtra("location",location);
            }
        });

    }
}
