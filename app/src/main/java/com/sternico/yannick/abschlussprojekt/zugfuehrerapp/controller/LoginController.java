package com.sternico.yannick.abschlussprojekt.zugfuehrerapp.controller;

import android.view.View;
import com.sternico.yannick.abschlussprojekt.zugfuehrerapp.activities.LoginActivity;
import com.sternico.yannick.abschlussprojekt.zugfuehrerapp.data.User;

public class LoginController {

    public Boolean handleLogin(View view) {
        String username = String.valueOf(LoginActivity.editText_username.getText());
        String password = LoginActivity.editText_password.getText().toString();

        User currentUser = new User(username, password);

        // TODO: Hier dann mit der REST-Schnittstelle arbeiten!
        return (currentUser.equals(new User("Admin", "A1234")));
    }
}
