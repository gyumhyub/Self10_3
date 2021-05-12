package com.example.self10_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String test;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        Button btnNewActivity1 = (Button) findViewById(R.id.btnNewActivity1);
        Button btnNewActivity2 = (Button) findViewById(R.id.btnNewActivity2);

        test = "android.resource://" + getPackageName() + "/raw/small";
        btnNewActivity.setText(test);
        test = "android.resource://" + getPackageName() + "/raw/sample1";
        btnNewActivity1.setText(test);
        test = "android.resource://" + getPackageName() + "/raw/sample2";
        btnNewActivity2.setText(test);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test = "android.resource://" + getPackageName() + "/raw/small";
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Name", test);
                startActivity(intent);
            }
        });

        btnNewActivity1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test = "android.resource://" + getPackageName() + "/raw/sample1";
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Name", test);
                startActivity(intent);
            }
        });
        btnNewActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test = "android.resource://" + getPackageName() + "/raw/sample2";
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Name", test);
                startActivity(intent);
            }
        });
    }
}
