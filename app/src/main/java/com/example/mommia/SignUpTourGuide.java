package com.example.mommia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUpTourGuide extends AppCompatActivity {
    EditText to_et_full_name, to_et_email, to_et_password, to_et_phone_number, to_et_national, to_et_date_of_birth, to_et_passport_national;
    SwitchCompat to_sw_gender;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_tour_guide);


        to_et_full_name = findViewById(R.id.to_et_full_name);
        to_et_email = findViewById(R.id.to_et_email);
        to_et_password = findViewById(R.id.to_et_password);
        to_et_phone_number = findViewById(R.id.to_et_phone);
        to_sw_gender = findViewById(R.id.to_sw_btn_gender);
        to_et_national = findViewById(R.id.to_et_national);
        to_et_date_of_birth = findViewById(R.id.to_et_date_of_birth);
        to_et_passport_national = findViewById(R.id.to_et_passport_national);
        btn_next = findViewById(R.id.btn_next);
    }
}