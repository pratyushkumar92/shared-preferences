package com.example.pratyush.sharedpreferences2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button register, signin;
    EditText euser, epasswor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euser=(EditText)findViewById(R.id.et1);
        epasswor=(EditText)findViewById(R.id.et2);
        register=(Button)findViewById(R.id.btn2);
        signin=(Button)findViewById(R.id.btn1);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharePreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, register.class);
                startActivity(intent);
            }
        });

    }
}
