package com.example.passmultiplevalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private EditText mEditTextDOB;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.etName);
        mEditTextDOB = findViewById(R.id.editTextDate);
    }

    public void onRadioBtnClick(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rbMale:
                if(checked)
                    title = "Mr. ";
                break;

            case R.id.rbFemale:
                if(checked)
                    title = "Ms. ";
                break;

            default: break;
        }

    }

    public void show(View view) {
        String name = mEditText.getText().toString();
        String DOB = mEditTextDOB.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NameField", title + name);
        intent.putExtra("DOB", DOB);
        startActivity(intent);
    }
}