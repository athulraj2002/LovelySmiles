package com.example.raju.lovelysmiles;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
   public ImageButton hmbtn;
    public Intent hmint;
    SharedPreferences settings;
    SharedPreferences.Editor editor;
    TextView Name,Age,Location,Phone,Topic,dnt,clinic;
   // LinearLayout pll1,pll2,pll3;
    //ImageButton p1,p2,p3;
   /* private void allgone(){
        pll1.setVisibility(LinearLayout.GONE);
        pll2.setVisibility(LinearLayout.GONE);
        pll2.setVisibility(LinearLayout.GONE);

        p1.setBackgroundResource(R.drawable.plus_24px);
        p2.setBackgroundResource(R.drawable.plus_24px);
        p3.setBackgroundResource(R.drawable.plus_24px);

    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        settings=getSharedPreferences("settings",0);
        editor=settings.edit();

        Name=findViewById(R.id.hname);
        Age=findViewById(R.id.hage);
        Location=findViewById(R.id.hlocation);
        Phone=findViewById(R.id.hcontact);
        Topic=findViewById(R.id.topic);
        dnt=findViewById(R.id.hdatetime);
        clinic=findViewById(R.id.hclinic);

        Name.setText(settings.getString("username",null));
        Age.setText("Age : "+settings.getString("age",null)+"yrs");
        Location.setText(settings.getString("location",null));
        Phone.setText("Ph: "+settings.getString("contact",null));
        if (settings.getString("booked",null).equals("no")){

            Topic.setText("Nothing To Display");
            dnt.setVisibility(TextView.GONE);
            clinic.setVisibility(TextView.GONE);
        }
        else {
            Topic.setText("Teeth Whitening");
            dnt.setText(settings.getString("date",null)+"    "+settings.getString("time",null));
            clinic.setText(settings.getString("clinic",null)+" Clinic");

        }


       /* pll1=(LinearLayout)findViewById(R.id.pll1);
        pll2=(LinearLayout)findViewById(R.id.pll2);
        pll3=(LinearLayout)findViewById(R.id.pll3);

        p1=(ImageButton)findViewById(R.id.p1);
        p2=(ImageButton)findViewById(R.id.p2);
        p3=(ImageButton)findViewById(R.id.p3);


        pll2.setVisibility(LinearLayout.GONE);
        p2.setBackgroundResource(R.drawable.plus_24px);
        pll3.setVisibility(LinearLayout.GONE);
        p3.setBackgroundResource(R.drawable.plus_24px);


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgone();
                p1.setBackgroundResource(R.drawable.minus_24px);
                pll1.setVisibility(View.VISIBLE);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgone();
                p2.setBackgroundResource(R.drawable.minus_24px);
                pll2.setVisibility(View.VISIBLE);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgone();
                p3.setBackgroundResource(R.drawable.minus_24px);
                pll3.setVisibility(View.VISIBLE);
            }
        }); */

      hmint=new Intent(Home.this,Registration1.class);
        hmbtn=(ImageButton) findViewById(R.id.homebtn);
       hmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(settings.getString("booked",null).equals("yes")){
                    Toast.makeText(Home.this, "Already Booked,Proceeding will cancel current booking", Toast.LENGTH_LONG).show();
                }
                startActivity(hmint);
            }
        });
    }
}









