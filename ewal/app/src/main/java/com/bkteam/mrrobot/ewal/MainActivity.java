package com.bkteam.mrrobot.ewal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread bamgio= new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch (Exception e){

                }
                finally {
                    Intent intent=new Intent(MainActivity.this, Login.class);
                    startActivity(intent);
                }
            }
        };
        bamgio.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }
}
