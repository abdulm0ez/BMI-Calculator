package com.example.androidapplications;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editWeight, editHeightFt, editHeightIn;
        Button buttonCalculate;
        TextView txtResult;
        LinearLayout llMain;

        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightIn);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        txtResult = findViewById(R.id.txtResult);
        llMain = findViewById(R.id.llMain);

        editWeight.requestFocus();

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sWeight = editWeight.getText().toString();
                String sFt = editHeightFt.getText().toString();
                String sIn = editHeightIn.getText().toString();

                if (sWeight.isEmpty() || sFt.isEmpty() || sIn.isEmpty()) {
                    txtResult.setText("Please enter all values");
                    return;
                }

                int wt = Integer.parseInt(sWeight);
                int ft = Integer.parseInt(sFt);
                int in = Integer.parseInt(sIn);

                if (wt == 0 && ft == 0 && in == 0) {
                    txtResult.setText("Please enter valid values");
                    llMain.setBackgroundColor(getResources().getColor(R.color.white));
                    return;
                }

               int totalInches = (ft * 12) + in;

               double totalCm = totalInches * 2.54;

               double totalM = totalCm / 100;

                double bmi = wt / (totalM * totalM);

                if (bmi > 25) {
                    txtResult.setText("You're Overweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.ColorOW));
                } else if (bmi < 18) {
                    txtResult.setText("You're Underweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.ColorUW));
                } else {
                    txtResult.setText("You're Healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.ColorHW));
                }
            }
        });
    }
}
