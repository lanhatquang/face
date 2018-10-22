package com.bkteam.mrrobot.ewal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Signup extends AppCompatActivity {
    private Button m_signup, m_loginFB;
    private EditText m_email, m_password,m_conferm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        m_signup = (Button) findViewById(R.id.BtnSignup);
        m_email = (EditText) findViewById(R.id.EmailorPhone);
        m_password = (EditText) findViewById(R.id.Password);
        m_conferm = (EditText) findViewById(R.id.ConfermPass);
        m_loginFB = (Button) findViewById(R.id.loginFB);




        m_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String GetEmail = m_email.getText().toString();
                String GetPass = m_password.getText().toString();
                String GetConferm = m_conferm.getText().toString();

                if(GetEmail.length()!=0 && GetPass.length()!=0 && GetPass.equals(GetConferm)){
                    finish();
                }else{
                    Toast.makeText(Signup.this, "Your Email or Password is wrong", Toast.LENGTH_SHORT).show();
                }
            }

        });

        m_loginFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, LoginFB.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
