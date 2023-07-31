package com.example.mycontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void contact1 (View view){
        Intent intent = new Intent(this, contactInformation.class);
        startActivity(intent);
    }
    public void contact2 (View view){
        Intent intent = new Intent(this, EmmaiInfo.class);
        startActivity(intent);
    }

    public void contact3(View view) {
        Intent intent = new Intent(this, ViratInfo.class);
        startActivity(intent);
    }
}