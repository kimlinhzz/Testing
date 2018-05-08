package com.example.lovkimlinh.testing;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lovkimlinh on 4/2/18.
 */

public class Main extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    TextView textView1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        textView = findViewById(R.id.notnow);
        textView1= findViewById(R.id.option_text);
        textView.setOnClickListener(this);
        textView1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        
        switch (v.getId()){
            
            
            case R.id.notnow :
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        break;

            case R.id.option_text :
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
                break;

    }
    }
}
