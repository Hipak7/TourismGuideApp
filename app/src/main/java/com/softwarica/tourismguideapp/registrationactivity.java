package com.softwarica.tourismguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class registrationactivity extends AppCompatActivity {

    TextView tvdob;
    int year1;
    int month1;
    int day1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationactivity);
        tvdob = findViewById(R.id.etDOB);
        tvdob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDatePickerDate();
            }
        });
    }
    public void loadDatePickerDate(){

        final Calendar c=Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                String date = "Date of Birth: "+month + "/" + dayOfMonth + "/" + year;
                month1=month;
                day1=dayOfMonth;
                year1=year;
                tvdob.setText(date);
            }
        },year,month,day);
        datePickerDialog.show();
    }
}
