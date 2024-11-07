package com.example.belajarandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    //deklarasi variabel
    private EditText txtUser_code;
    private EditText txtPass_code;
    private Button btnLogin_code;
    private Intent i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //konfigurasi
        txtUser_code=(EditText) findViewById(R.id.txtUser);
        txtPass_code=(EditText) findViewById(R.id.txtPass);
        btnLogin_code=(Button) findViewById(R.id.btnLogin);
        txtPass_code.setText("masukkan password");

        //ketika button login di klik
        btnLogin_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

                i = new Intent(getApplicationContext(), BelajarPalette.class);
                startActivity(i);

            }
        });
    }
}