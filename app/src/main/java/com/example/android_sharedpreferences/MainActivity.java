package com.example.android_sharedpreferences;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
    }
    public void save(View view) {
        String email=username.getText().toString();
        String pass=password.getText().toString();

        SharedPreferences preferences=getSharedPreferences("email",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("email",email);
        editor.putString("password",pass);
        editor.apply();
        Toast.makeText(MainActivity.this,"Shared preferences saved successfully",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}