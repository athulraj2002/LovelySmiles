package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public Button button;
    public TextView newuser;
    Intent i;
    EditText uname,pass;
    SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname=findViewById(R.id.luname);
        pass=findViewById(R.id.lpass);
        settings=getSharedPreferences("settings",0);
        button =(Button) findViewById(R.id.button_login);
        newuser=(TextView)findViewById(R.id.newuser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (uname.getText().toString().equals("")||pass.getText().toString().equals("")){
                    Toast.makeText(Login.this, "Please Fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else if(!uname.getText().toString().equals(settings.getString("username",null))||
                        !pass.getText().toString().equals(settings.getString("password",null))){
                    Toast.makeText(Login.this, "Incorrect Username or password", Toast.LENGTH_SHORT).show();
                }

                else {
                    i = new Intent(Login.this, Home.class);
                    Toast.makeText(Login.this, "Logged in", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
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
