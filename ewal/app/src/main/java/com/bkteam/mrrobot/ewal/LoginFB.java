package com.bkteam.mrrobot.ewal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginFB extends AppCompatActivity {

    private Button m_btn;
    private EditText m_edit1,m_edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_fb);

        m_btn = (Button) findViewById(R.id.logFB);
        m_edit1 = (EditText) findViewById(R.id.mailphpone);
        m_edit2 = (EditText) findViewById(R.id.passFB);



        m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail= m_edit1.getText().toString();
                String pass= m_edit2.getText().toString();
                if(mail.length()!=0 && pass.length()!=0){
                    Intent intent = new Intent(LoginFB.this, PerInfo.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
