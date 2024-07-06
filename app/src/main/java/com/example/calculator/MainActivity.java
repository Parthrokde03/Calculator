package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button Add, Subtract, Multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etsecondValue);
        tvAns = findViewById(R.id.tvAns);
        Add = findViewById(R.id.bAddition);
        Subtract = findViewById(R.id.bSubtraction);
        Multiply = findViewById(R.id.bMultiplication);
        divide = findViewById(R.id.bDivision);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Firstvalue, Secondvalue, Ans;

                Firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                Secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                Ans = Firstvalue + Secondvalue;
                tvAns.setText("Result = " + Ans);


            }

        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Fristvalue , Secondvalue, Ans;

                Fristvalue = Integer.parseInt(etFirstValue.getText().toString());
                Secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                Ans = Fristvalue - Secondvalue;
                tvAns.setText("Result = " + Ans);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Fristvalue , Secondvalue, Ans;

                Fristvalue = Integer.parseInt(etFirstValue.getText().toString());
                Secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                Ans = Fristvalue * Secondvalue;
                tvAns.setText("Result = " + Ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Fristvalue , Secondvalue, Ans;

                Fristvalue = Integer.parseInt(etFirstValue.getText().toString());
                Secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                Ans = Fristvalue / Secondvalue;
                tvAns.setText("Result = " + Ans);
            }
        });


    }
}