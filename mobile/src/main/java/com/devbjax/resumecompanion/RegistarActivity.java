package com.devbjax.resumecompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);

        //Setting up text fields
        final EditText firstnameField = (EditText) findViewById(R.id.firstnameField);
        final EditText lastnameField = (EditText) findViewById(R.id.lastnameField);
        final EditText usernameField = (EditText) findViewById(R.id.usernameField);
        final EditText passwordField = (EditText) findViewById(R.id.passwordField);
        final EditText verifyPasswordField = (EditText) findViewById(R.id.verifyPasswordField);

        //Setting up the button
        final Button signUpButton = (Button) findViewById(R.id.signUpButton);

    }
}
