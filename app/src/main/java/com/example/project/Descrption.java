package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Descrption extends AppCompatActivity {
    private ImageView image;
    private  Animation bottm;

    private TextView txt;
    private Animation top;
    private Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descrption);
        image=findViewById(R.id.descrption);
        b1=findViewById(R.id.onebottom);
        b2=findViewById(R.id.secoundbottm);
        b3=findViewById(R.id.thiredbuttom);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        top= AnimationUtils.loadAnimation(this,R.anim.topanimation);
        bottm=AnimationUtils.loadAnimation(this,R.anim.bottom);
        Intent intent=getIntent();
        String st= intent.getStringExtra("name");
        txt=findViewById(R.id.textDescription);
        int findImage=check(st);
        if(findImage==0){
            image.setImageResource(R.drawable.merdao);
        }
        else if(findImage==1){
            image.setImageResource(R.drawable.casblanca);
        }else if(findImage==2){
            image.setImageResource(R.drawable.royalcort);
        }
        else if(findImage==3){
            image.setImageResource(R.drawable.melenom);
        }else{
            image.setImageResource(R.drawable.karmel);
        }
        image.setAnimation(top);
        b1.setAnimation(bottm);
        b2.setAnimation(bottm);
        b3.setAnimation(bottm);
        txt.setAnimation(top);

    }

    public int check(String st){
        if(st.equals("Merado")){
           return 0;


        }
        else if(st.equals("Casablanca")){
            return  1;

        }
        else if(st.equals("Royal cort")){
            return  2;
        }
        else if(st.equals("Melenoem")){
           return 3;

        }
        else{
       return   4;


        }
    }

    public void btnForMoreThan3Person(View view) {
    }

    public void btnforTwoPerson(View view) {
    }

    public void btnThreeperson(View view) {
    }
}