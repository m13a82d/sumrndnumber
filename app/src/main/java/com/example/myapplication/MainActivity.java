package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View btngnarate = (Button)findViewById(R.id.btngnarate);
        View txtnewnum1 =(TextView)findViewById(R.id.txtnewnum1);
        View textresult =(TextView)findViewById(R.id.textresult);
        View txtvewnumber2 =(TextView)findViewById(R.id.txtvewnumber2);
        btngnarate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Random rnd = new Random();
                int number1 = rnd.nextInt(100);
                int number2 = rnd.nextInt(1000);
                ((TextView)txtnewnum1).setText(String.valueOf(number1));
                ((TextView)txtvewnumber2).setText(String.valueOf(number2));
                String result = String.valueOf(number1+number2);
                ((TextView)textresult).setText(String.valueOf(result));
            }
        });
    }

}