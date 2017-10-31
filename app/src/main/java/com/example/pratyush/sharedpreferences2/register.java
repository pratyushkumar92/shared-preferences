package com.example.pratyush.sharedpreferences2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText etu3,etp4,eto5,eta6;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etu3=(EditText)findViewById(R.id.et3);
        etp4=(EditText)findViewById(R.id.et4);
        eto5=(EditText)findViewById(R.id.et5);
        eta6=(EditText)findViewById(R.id.et6);
        save=(Button)findViewById(R.id.btn3);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharePreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharePreferences.edit();
                editor.putString("name", etu3.getText().toString());
                editor.putString("password", etp4.getText().toString());
                editor.putString("occupation", eto5.getText().toString());
                editor.putString("age", eta6.getText().toString());
                editor.commit();
                Intent intent=new Intent(register.this, result.class);
                startActivity(intent);

            }
        });
    }
}
