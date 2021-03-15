package com.example.my_application3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2,text3;
    Button butn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.txt1);
        text2=findViewById(R.id.txt2);
        text3=findViewById(R.id.txt3);
        butn1=findViewById(R.id.btn1);
        final int massBody=Integer.parseInt(text1.getText().toString());
        final int heightBody=Integer.parseInt(text2.getText().toString());
        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int bmi=massBody/(heightBody*heightBody);
                text3.setText(bmi);
            }
        });
    }
}