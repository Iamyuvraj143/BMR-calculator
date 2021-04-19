package com.example.bmr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button m ;
    private Button f ;
    private Button cal;
    private Button NoExcercise;
    private Button LightExercise;
    private Button MediumExercise;
    private Button HardExercise;
    private Button Nutri;
    private TextView aage;
    private TextView hheight;
    private TextView wweight;
     private TextView ResultBmr;
    private boolean Gender ;
    double bmrsum;
   public double ResultSum ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetupUIViews();






         m.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 int agee = Integer.parseInt(aage.getText().toString());
                 int weight1 = Integer.parseInt(wweight.getText().toString());
                 int height1 = Integer.parseInt(hheight.getText().toString());
                  bmrsum = 66+(13.7*weight1)+(5*height1)-(6.8*agee);



             }
         });
         Nutri.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(MainActivity.this, P2.class);
                 intent.putExtra("Value",ResultSum);

                 startActivity(intent);




             }
         });
         f.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 int agee = Integer.parseInt(aage.getText().toString());
                 int weight1 = Integer.parseInt(wweight.getText().toString());
                 int height1 = Integer.parseInt(hheight.getText().toString());
                  bmrsum = 655+(9.6*weight1)+(1.8*height1)-(4.7*agee);

             }
         });

        NoExcercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResultSum=bmrsum*1.2;

            }
        });

        LightExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResultSum=bmrsum*1.375;

            }
        });

        MediumExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResultSum=bmrsum*1.55;

            }
        });


        HardExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResultSum=bmrsum*1.75;

            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


           ResultBmr.setText("Your BMR is : "+ Double.toString(bmrsum));





            }
        });





    }

    private void SetupUIViews() {
        m = (Button) findViewById(R.id.Male);
        f = (Button) findViewById(R.id.female);
        cal = (Button) findViewById(R.id.Calculate);
        NoExcercise = (Button) findViewById(R.id.No);
        LightExercise = (Button) findViewById(R.id.light);
        MediumExercise = (Button) findViewById(R.id.medium);
        HardExercise = (Button) findViewById(R.id.Hard);
        Nutri = (Button) findViewById(R.id.Nutrition);
        aage = (EditText) findViewById(R.id.age);
        hheight = (EditText) findViewById(R.id.height);
        wweight = (EditText) findViewById(R.id.weight);
        ResultBmr = (TextView) findViewById(R.id.Bmr);



    }
}
