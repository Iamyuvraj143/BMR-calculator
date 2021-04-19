package com.example.bmr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P2 extends AppCompatActivity {


    private TextView tv;
    private ImageView im;
    private TextView t1;
    private  TextView t2;
    private TextView tv3;
    double temp;
    double protein;
    double carbs;
    double fats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        im=(ImageView)findViewById(R.id.pic) ;
        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv2);
        tv= (TextView)findViewById(R.id.Fcal);
        tv3=(TextView)findViewById(R.id.display);
        Intent intent=getIntent();
        double Result=intent.getDoubleExtra("Value",0.00);
        tv.setText("Your daily calorie need is: "+Result);
        temp=Result;
        protein=temp*25/100;
        protein=protein/4;
        carbs=temp*50/100;
        carbs=carbs/4;
        fats=temp*25/100;
        fats=fats/9;

        tv3.setText("Protein : "+Double.toString(Math.round(protein)) +" gram \nCarbs : "+Double.toString(Math.round(carbs))+" gram \nFats : "+Double.toString(Math.round(fats))+" gram");
         tv3.setText(quoteText);

    }
}