package com.example.oksie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignOrLogin extends AppCompatActivity {

    EditText edUser;
    Button btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_or_login);

        btnSignIn = findViewById(R.id.btnSignIn);

        edUser =findViewById(R.id.editUser);


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignOrLogin.this, MainScreen.class);
                startActivity(intent);
            }
        });

    }
}