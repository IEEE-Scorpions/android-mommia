package com.example.mommia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUPTourist extends AppCompatActivity {
    EditText et_full_name, et_email, et_password, et_phone_number, et_national, et_date_of_birth, et_passport_national;
    SwitchCompat sw_gender;
    Button btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_tourist);

        et_full_name = findViewById(R.id.et_full_name);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_phone_number = findViewById(R.id.et_phone);
        sw_gender = findViewById(R.id.sw_btn_gender);
        et_national = findViewById(R.id.et_national);
        et_date_of_birth = findViewById(R.id.et_date_of_birth);
        et_passport_national = findViewById(R.id.et_passport_national);
        btn_sign_up = findViewById(R.id.btn_next);

    }
}