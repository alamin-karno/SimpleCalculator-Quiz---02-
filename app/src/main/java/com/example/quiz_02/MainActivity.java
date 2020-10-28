package com.example.quiz_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultTV;
    Button btnOne,btnTwo,btnTree,btnFour,btnFive;
    String beforeadd,afteradd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = findViewById(R.id.resultTV);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnTree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultTV.getText().toString();
                String newresult = btnOne.getText().toString();

                resultTV.setText(result+newresult);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultTV.getText().toString();
                String newresult = btnTwo.getText().toString();

                resultTV.setText(result+newresult);
            }
        });

        btnTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultTV.getText().toString();
                String newresult = btnTree.getText().toString();

                resultTV.setText(result+newresult);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultTV.getText().toString();
                String newresult = btnFour.getText().toString();

                resultTV.setText(result+newresult);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultTV.getText().toString();
                String newresult = btnFive.getText().toString();

                resultTV.setText(result+newresult);
            }
        });


    }

    public void about(View view) {
        startActivity(new Intent(MainActivity.this,DeveloperActivity.class));
    }

    public void egual(View view) {

        afteradd = resultTV.getText().toString();

        double result = Double.parseDouble(beforeadd) + Double.parseDouble(afteradd) ;

        resultTV.setText("Result = "+result);

    }

    public void addition(View view) {

      beforeadd =  resultTV.getText().toString();

      resultTV.setText("");
    }
}