package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class payment extends AppCompatActivity {
    LinearLayout ll1,ll2,ll3,ll4;
    ImageButton pbw;
    Button btn_done;
    Intent canint;
    TextView cancel;
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
        btn_done=(Button)findViewById(R.id.btn_done);
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canint.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Toast.makeText(payment.this, "Successfully Booked!!", Toast.LENGTH_SHORT).show();
                startActivity(canint);
            }
        });
        canint=new Intent(payment.this,Home.class);
        pbw=(ImageButton)findViewById(R.id.pbw);
        pbw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        cancel=(TextView)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                canint.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(canint);
            }
        });
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
