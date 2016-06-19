package com.devbjax.resumecompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//going to push

        //Setting up edit text fields
        final EditText usernameField = (EditText) findViewById(R.id.usernameField);
        final EditText passwordField = (EditText) findViewById(R.id.passwordField);

        //Setting up buttons
        Button logInButton = (Button) findViewById(R.id.logInButton);
        Button registerButton = (Button) findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener(){
              @Override
                      public void onClick(View v) {
                  Intent registerIntent = new Intent(MainActivity.this, RegistarActivity.class);
                  MainActivity.this.startActivity(registerIntent);
              }
        });
    }


}
