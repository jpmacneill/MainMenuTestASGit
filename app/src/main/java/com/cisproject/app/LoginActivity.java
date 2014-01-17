package com.cisproject.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Joel on 16/01/14.
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button backButton = (Button)findViewById(R.id.loginButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                // Return user to the Main Menu
                EditText userText = (EditText) findViewById(R.id.usernameText);
                EditText passText = (EditText) findViewById(R.id.passwordText);

                String user = userText.getText().toString();
                String pass = passText.getText().toString();

                if (user.equals("user") && pass.equals("password")) {
                    Toast.makeText(LoginActivity.this, "Login Success!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainMenuActivity.class);
                    startActivity(intent);
                    finish();
                } else if(user.equals("admin") && pass.equals("password")) {
                    Toast.makeText(LoginActivity.this, "Logged in as admin.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainMenuActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed.", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
