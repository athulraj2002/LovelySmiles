package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    public Button SignupBtn;
    public Intent signIntent;
    SharedPreferences settings;
    SharedPreferences.Editor editor;
    EditText uname,pass,cpass,cnum,location,age,email;
    public void validate(){
        if(uname.getText().toString().matches("")||
                pass.getText().toString().matches("")||
                cpass.getText().toString().matches("")||
                cnum.getText().toString().matches("")||
                location.getText().toString().matches("")||
                age.getText().toString().matches("")||
                email.getText().toString().matches("")){

            Toast.makeText(this, "Please Fill All Fields", Toast.LENGTH_LONG).show();
        }
        else if(!pass.getText().toString().equals(cpass.getText().toString())){

            Toast.makeText(this, "Password Doesn't Match", Toast.LENGTH_SHORT).show();
        }
        else {

            editor.putString("username",uname.getText().toString());
            editor.putString("password",pass.getText().toString());
            editor.putString("contact",cnum.getText().toString());
            editor.putString("location",location.getText().toString());
            editor.putString("age",age.getText().toString());
            editor.putString("email",email.getText().toString());
            editor.putString("date",null);
            editor.putString("time",null);
            editor.putString("booked","no");
            editor.putString("clinic",null);

            editor.commit();
            Toast.makeText(Signup.this, "Account Created Successfully", Toast.LENGTH_SHORT).show();
            startActivity(signIntent);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        SignupBtn=(Button)findViewById(R.id.button_signup);
        settings=getApplicationContext().getSharedPreferences("settings",0);
        editor=settings.edit();

        uname=findViewById(R.id.susername);
        pass=findViewById(R.id.spassword);
        cpass=findViewById(R.id.sconpass);
        cnum=findViewById(R.id.scontact);
        location=findViewById(R.id.slocation);
        age=findViewById(R.id.sage);
        email=findViewById(R.id.semail);

        signIntent=new Intent(Signup.this,Login.class);
        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
    }
}
