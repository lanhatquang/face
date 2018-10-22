package com.bkteam.mrrobot.ewal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button m_login, m_signup, m_forgot;
    private EditText m_password,m_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        m_forgot = (Button) findViewById(R.id.forgot);
        m_login = (Button) findViewById(R.id.btnsubmit);
        m_signup = (Button) findViewById(R.id.btnsignup);
        m_email = (EditText) findViewById(R.id.email);
        m_password = (EditText) findViewById(R.id.password);

        final Intent intent = new Intent(this,Signup.class);
        final Intent intentProfile = new Intent(this,MenuApp.class);
        final Intent intentForgot = new Intent(this,Forgot_Password.class);

        m_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        m_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_login = m_email.getText().toString();
                String password_login = m_password.getText().toString();

                if(email_login.length()!=0 && password_login.length()!=0){
                    startActivity(intentProfile);
                }else{
                    Toast.makeText(Login.this, "Please, Fill in the form!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        m_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentForgot);
            }
        });

    }
}
