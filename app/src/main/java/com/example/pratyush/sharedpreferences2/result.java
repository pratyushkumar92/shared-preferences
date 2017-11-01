package com.example.pratyush.sharedpreferences2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView tvu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        SharedPreferences sharePreferences=getSharedPreferences("MyData", MODE_PRIVATE);
        String display=sharePreferences.getString("display", "");
        tvu1=(TextView)findViewById(R.id.tv1);
        tvu1.setText(display);

    }
}
