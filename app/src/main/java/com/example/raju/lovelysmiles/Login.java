package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public Button button;
    public TextView newuser;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button =(Button) findViewById(R.id.button_login);
        newuser=(TextView)findViewById(R.id.newuser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(Login.this,Home.class);
                Toast.makeText(Login.this, "Logged in", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(Login.this,Signup.class);
                startActivity(i);
            }
        });
    }
}
