package com.bkteam.mrrobot.ewal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Forgot_Password extends AppCompatActivity {
    EditText m_mail, m_phone;
    Button m_btn;
    RadioGroup m_raG;
    int tmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot__password);

        m_mail = (EditText) findViewById(R.id.email);
        m_phone = (EditText) findViewById(R.id.phone);
        m_btn = (Button) findViewById(R.id.btnforgot);
        m_raG = (RadioGroup) findViewById(R.id.radiogroup);

        m_raG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tmp = checkedId;
            }
        });

        m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = m_mail.getText().toString();
                String phone = m_phone.getText().toString();

                if(mail=="" && phone==""){
                    Toast.makeText(Forgot_Password.this, "Please, missing data!", Toast.LENGTH_SHORT).show();
                }else if(mail!="" && tmp==R.id.radio1){
                    Toast.makeText(Forgot_Password.this, "Please check email!", Toast.LENGTH_SHORT).show();
                    finish();
                }else if(phone!="" && tmp==R.id.radio2){
                    Toast.makeText(Forgot_Password.this, "Please check sms!", Toast.LENGTH_SHORT).show();
                    finish();
                }else Toast.makeText(Forgot_Password.this, "Please, missing data!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
