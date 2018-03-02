package com.example.raju.lovelysmiles;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Registration2 extends AppCompatActivity {
     public TextView pdate;
     Calendar myCalendar;
     Intent r2next;
     ImageButton r2bw,r2fw;
     String time;
        TextView t1,t2,t3,t4,t5,t6;
    DatePickerDialog.OnDateSetListener date;
    private void updateLabel() {
        String myFormat = "dd-MM-yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        pdate.setText(sdf.format(myCalendar.getTime()));
        r2next.putExtra("date",pdate.getText().toString());



    }
    private void timeselect(){
        t1.setTextColor(Color.parseColor("#3e89d9"));
        t1.setBackground(getDrawable(R.drawable.border1));
        t2.setTextColor(Color.parseColor("#3e89d9"));
        t2.setBackground(getDrawable(R.drawable.border1));
        t3.setTextColor(Color.parseColor("#3e89d9"));
        t3.setBackground(getDrawable(R.drawable.border1));
        t4.setTextColor(Color.parseColor("#3e89d9"));
        t4.setBackground(getDrawable(R.drawable.border1));
        t5.setTextColor(Color.parseColor("#3e89d9"));
        t5.setBackground(getDrawable(R.drawable.border1));
        t6.setTextColor(Color.parseColor("#3e89d9"));
        t6.setBackground(getDrawable(R.drawable.border1));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);


        t1=(TextView)findViewById(R.id.time1);
        t2=(TextView)findViewById(R.id.time2);
        t3=(TextView)findViewById(R.id.time3);
        t4=(TextView)findViewById(R.id.time4);
        t5=(TextView)findViewById(R.id.time5);
        t6=(TextView)findViewById(R.id.time6);
        time=t1.getText().toString();
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect();
                t1.setTextColor(Color.parseColor("#ffffff"));
                t1.setBackground(getDrawable(R.drawable.border2));
                time=t1.getText().toString();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect();
                t2.setTextColor(Color.parseColor("#ffffff"));
                t2.setBackground(getDrawable(R.drawable.border2));
                time=t2.getText().toString();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect();
                t3.setTextColor(Color.parseColor("#ffffff"));
                t3.setBackground(getDrawable(R.drawable.border2));
                time=t3.getText().toString();
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect();
                t4.setTextColor(Color.parseColor("#ffffff"));
                t4.setBackground(getDrawable(R.drawable.border2));
                time=t4.getText().toString();
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect();
                t5.setTextColor(Color.parseColor("#ffffff"));
                t5.setBackground(getDrawable(R.drawable.border2));
                time=t5.getText().toString();
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect();
                t6.setTextColor(Color.parseColor("#ffffff"));
                t6.setBackground(getDrawable(R.drawable.border2));
                time=t6.getText().toString();
            }
        });
        r2next=new Intent(Registration2.this,registration3.class);
        r2fw=(ImageButton)findViewById(R.id.r2fw);
        r2fw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r2next.putExtra("time",time);
                startActivity(r2next);
            }
        });
        r2bw=(ImageButton)findViewById(R.id.r2bw);
        r2bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        myCalendar = Calendar.getInstance();
        pdate=(TextView)findViewById(R.id.pickdate);
         date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        pdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Registration2.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


    }
}
