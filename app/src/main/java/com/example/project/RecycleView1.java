package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleView1 extends AppCompatActivity {
    private Spinner sp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        sp=findViewById(R.id.subject);
        RecyclerView recycler = findViewById(R.id.recycle);

        String[] captions = new String[Hotels.subject.length];
        int[] ids = new int[Hotels.subject.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Hotels.subject[i].getName();
            ids[i] = Hotels.subject[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adabter adapter = new Adabter(captions, ids);
        recycler.setAdapter(adapter);
    }


    public void btnToSUbject(View view){


    }
}