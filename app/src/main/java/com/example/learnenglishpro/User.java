package com.example.learnenglishpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class User {
    public String id;
    public String userName;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

}
