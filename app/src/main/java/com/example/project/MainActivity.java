package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.userName);
        pass=findViewById(R.id.password);
    }

    public void btnOnclick(View view) {
        Intent intent=new Intent(this, RecycleView1.class);
        startActivity(intent);
    }

    public void openSignUpActivity(View view) {
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }
}