package com.procity.android.restapisimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    private void sayHello(){
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }

}