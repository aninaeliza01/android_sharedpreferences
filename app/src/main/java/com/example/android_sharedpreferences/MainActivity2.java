package com.example.android_sharedpreferences;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.tv2);
        SharedPreferences sharedPreferences=getSharedPreferences("email",MODE_PRIVATE);
        String msg=sharedPreferences.getString("email","");
        String msg2=sharedPreferences.getString("password","");
        tv.setText("Email is"+ msg +" and password is "+msg2);
    }
}