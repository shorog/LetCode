package com.example.a96653.LetsCode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class firstlevel_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstlevel_1);



        Button goButton = (Button)findViewById(R.id.button3);
        //home button
      ImageButton homebtn=(ImageButton)findViewById(R.id.homebtn);

       homebtn.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent HomePage=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(HomePage);
            }
        });

        goButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        openSecondActivity();
                    }

                }

        );
    }





    public void openSecondActivity() {
        Intent intent = new Intent(this, firstlevel_2.class);
        startActivity(intent);

    }








//android:layout_alignBottom="@+id/imageView40"



}
