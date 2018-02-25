package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    public Button hmbtn;
    public Intent hmint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        hmint=new Intent(Home.this,Registration1.class);
        hmbtn=(Button)findViewById(R.id.button_home);
        hmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(hmint);
            }
        });
    }
}
