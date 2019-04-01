package com.example.sirius.homework_1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button androidButton;
    private Button allReportButton;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidButton = findViewById(R.id.android_button);
        androidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.android_toast,Toast.LENGTH_SHORT).show();
            }
        });

        allReportButton = findViewById(R.id.allReport_button);
        allReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.allReport_toast,Toast.LENGTH_SHORT).show();

            }
        });
    }

}
