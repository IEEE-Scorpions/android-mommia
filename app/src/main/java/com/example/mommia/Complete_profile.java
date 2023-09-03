package com.example.mommia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Complete_profile extends AppCompatActivity {

    EditText et_college, et_cost, et_languages, et_company, et_certificate, et_experience;

    Button btn_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);

        et_college = findViewById(R.id.et_college);
        et_cost = findViewById(R.id.et_cost);
        et_languages = findViewById(R.id.et_languages);
        et_company = findViewById(R.id.et_company);
        et_certificate = findViewById(R.id.et_certificate);
        et_experience = findViewById(R.id.et_experience);
        btn_done = findViewById(R.id.btn_done);

    }
}