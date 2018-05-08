package com.example.lovkimlinh.testing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public class Splash extends AppCompatActivity {
    private final int min = 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashview);

          new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {
                      Intent intent = new Intent(Splash.this,Main.class);
                      Splash.this.startActivity(intent);
                      Splash.this.finish();
              }
          },min);
    }
}