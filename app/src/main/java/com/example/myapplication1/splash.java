package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.splash);

        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {   sleep(2000);}
                catch (Exception e)
                {   e.printStackTrace();}
                finally
                {{startActivity(new Intent(splash.this, menu.class));}}
            }
        };
        thread.start();
    }
}