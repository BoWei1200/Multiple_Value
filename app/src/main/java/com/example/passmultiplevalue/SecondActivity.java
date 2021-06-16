package com.example.passmultiplevalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mTextView;
    private TextView mTvDOB;
    private String name;
    private String DOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = findViewById(R.id.txtName);
        mTvDOB = findViewById(R.id.txtDOB);

        Intent intent = getIntent();
        name = intent.getStringExtra("NameField");
        DOB = intent.getStringExtra("DOB");
        mTextView.setText("Hello, " + name);
        mTvDOB.setText(DOB);
    }

    public void passByBundle(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);

        Bundle b = new Bundle();
        b.putString("nameStr", name);
        b.putString("DOB", DOB);

        intent.putExtras(b);
        startActivity(intent);
    }
}