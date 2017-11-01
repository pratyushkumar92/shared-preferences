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

    Button register,  signin;
    EditText euser, epassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euser=(EditText)findViewById(R.id.et1);
        epassword=(EditText)findViewById(R.id.et2);
        register=(Button)findViewById(R.id.btn2);
        signin=(Button)findViewById(R.id.btn1);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String user=euser.getText().toString();
                String password=epassword.getText().toString();
                SharedPreferences sharePreferences=getSharedPreferences("MyData", MODE_PRIVATE);
                String userDetails=sharePreferences.getString(user + password + "data", "Username or passsword is incorrect");
                SharedPreferences.Editor editor=sharePreferences.edit();
                editor.putString("display", userDetails);
                editor.commit();
                Intent displayScreen=new Intent(MainActivity.this, result.class);
                startActivity(displayScreen);

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
