package com.example.contactapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_name extends AppCompatActivity {
 TextView tv_name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        tv_name = (TextView)findViewById(R.id.tv_name);
        //tv_name.setText("hello");
         tv_name.setText(getIntent().getStringExtra("x"));
    }

}
