package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private EditText userName;
    private EditText pass;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName=findViewById(R.id.userName2);
        pass=findViewById(R.id.pass2);
        email=findViewById(R.id.email);

    }

    public void btnOnCLick(View view) {


    }
}