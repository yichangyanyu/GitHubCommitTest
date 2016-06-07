package com.bm.githubcommittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "11111", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "11111", Toast.LENGTH_SHORT).show();
    }
}
