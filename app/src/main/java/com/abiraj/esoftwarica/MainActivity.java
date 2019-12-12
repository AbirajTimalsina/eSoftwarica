package com.abiraj.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etname,etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etname);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(TextUtils.isEmpty(etname.getText())){
            etname.setError("Please enter your username");
            etname.requestFocus();
            return;
        }else if (TextUtils.isEmpty(etPassword.getText())){
            etPassword.setError("please enter your password");
            etPassword.requestFocus();
            return;
        }

            String First = etname.getText().toString();
            String Second = etPassword.getText().toString();

            if(First.equals("admin") && Second.equals("admin")) {
                //Code here
                Intent intent = new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
            }

            else {

                Toast.makeText(this, "Incorect username and password", Toast.LENGTH_SHORT).show();
            }

        }

    }

