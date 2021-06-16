package com.example.passmultiplevalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView mtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle b = getIntent().getExtras();

        String data1 = b.getString("nameStr");
        String data2 = b.getString("DOB");

        mtextView = findViewById(R.id.txtView);
        mtextView.setText("Name: " + data1 + "\n DOB: " + data2);
    }
}