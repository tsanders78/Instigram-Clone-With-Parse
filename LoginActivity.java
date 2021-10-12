package com.codepath.rkpandey.instagramclonewithparse;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.codepath.rkpandey.instagramclonewithparse.R;

public class LoginActivity extends AppCompatActivity {
    public static final String TAG = "Login Activity";
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);

        etUsername = findViewById (R.id.etUsername);
        etPassword = findViewById (R.id.etPassword);
        btnLogin = findViewById (R.id.btnLogin);
        btnLogin.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Log.i (TAG, "Onclick login button");
                String username = etUsername.getText ().toString ();
                String password = etPassword.getText ().toString ();
                loginUser (username, password);
            }

        });

    }

    private void loginUser(String username, String password) {
        Log.i (TAG, "Attempting to login user" + username);
    }

}

