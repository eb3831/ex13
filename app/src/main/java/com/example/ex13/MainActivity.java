package com.example.ex13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static Random rnd = new Random();
}