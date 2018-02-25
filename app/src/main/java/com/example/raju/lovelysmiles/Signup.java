package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    public Button SignupBtn;
    public Intent signIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        SignupBtn=(Button)findViewById(R.id.button_signup);
        signIntent=new Intent(Signup.this,Login.class);
        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Signup.this, "Account Created Successfully", Toast.LENGTH_SHORT).show();
                startActivity(signIntent);
            }
        });
    }
}
