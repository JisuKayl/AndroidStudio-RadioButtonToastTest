package com.example.radiobutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton android, java, python, angular;
    TextView tvResult;
    Button courseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = (RadioButton) findViewById(R.id.rbAndroid);
        java = (RadioButton) findViewById(R.id.rbJava);
        python = (RadioButton) findViewById(R.id.rbPython);
        angular = (RadioButton) findViewById(R.id.rbAngular);
        tvResult = (TextView) findViewById(R.id.tvResult);
        courseBtn = (Button) findViewById(R.id.courseBtn);

        courseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedCourse = "";

                if (android.isChecked()) {
                    selectedCourse = "Selected Course: Android";
                } else if (java.isChecked()) {
                    selectedCourse = "Selected Course: Java";
                } else if (python.isChecked()) {
                    selectedCourse = "Selected Course: Python";
                } else if (angular.isChecked()) {
                    selectedCourse = "Selected Course: Angular Js";
                }

                tvResult.setText(selectedCourse);

                Toast.makeText(getApplicationContext(), selectedCourse, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
