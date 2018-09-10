package com.sternico.yannick.abschlussprojekt.zugfuehrerapp.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sternico.yannick.abschlussprojekt.zugfuehrerapp.R;
import com.sternico.yannick.abschlussprojekt.zugfuehrerapp.controller.LoginController;

public class LoginActivity extends AppCompatActivity {

    LoginController controller;

    Context context = this;

    public static EditText editText_username;
    public static EditText editText_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_username = findViewById(R.id.editText_username);
        editText_password = findViewById(R.id.editText_password);
        btn_login = findViewById(R.id.btn_login);

        controller = new LoginController();
    }

    public void handleBtnLogin(View view) {
        Boolean isLoginSucceed = controller.handleLogin(view);

        if(isLoginSucceed) {
            Intent i = new Intent(context, WorkorderActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(context, "Es gab einen Fehler beim Login!", Toast.LENGTH_SHORT).show();
        }
    }
}
