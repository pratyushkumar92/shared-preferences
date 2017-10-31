package com.example.pratyush.sharedpreferences2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView tvu1, tvp2, tvo3, tva4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvu1=(TextView)findViewById(R.id.tv1);
        tvp2=(TextView)findViewById(R.id.tv2);
        tvo3=(TextView)findViewById(R.id.tv3);
        tva4=(TextView)findViewById(R.id.tv4);
        SharedPreferences sharePreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name1 = sharePreferences.getString("name", null);
        String password2 = sharePreferences.getString("password", null);
        String occupation3 = sharePreferences.getString("occupation", null);
        String age4 = sharePreferences.getString("age", null);
        tvu1.setText(name1);
        tvp2.setText(password2);
        tvo3.setText(occupation3);
        tva4.setText(age4);

    }
}
