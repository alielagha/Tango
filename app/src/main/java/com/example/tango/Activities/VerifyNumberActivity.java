package com.example.tango.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tango.R;

import java.util.ArrayList;
import java.util.List;

public class VerifyNumberActivity extends AppCompatActivity {

    Spinner spinner;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_number);

        nextBtn=  findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),VerifyCodeActivity.class);
                startActivity(intent);
            }
        });

        spinner = findViewById(R.id.spinner);

        List<String> list = new ArrayList<>();
        list.add("Select country");
        list.add("Egypt");
        list.add("Jordan");
        list.add("Palestine");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.spinner_item,list);
        spinner.setAdapter(adapter);
    }
}
