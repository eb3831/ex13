package com.example.ex13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    EditText etA, etB, etC;
    double a = 0, b = 0, c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);
    }

    public boolean isValidNum(String input) {
        return !((input.equals("")) ||
                (input.equals("-")) ||
                (input.equals(".")) ||
                (input.equals("+")) ||
                (input.equals("+.")) ||
                (input.equals("-.")));
    }

    public void clickedRandom(View view) {
        double numA = (Math.random() * (100 - (-100))) + (-100);
        double numB = (Math.random() * (100 - (-100))) + (-100);
        double numC = (Math.random() * (100 - (-100))) + (-100);
        etA.setText("" + numA);
        etB.setText("" + numB);
        etC.setText("" + numC);
    }

    public void clickedResult (View view)
    {
        solve();
    }
    public void solve()
    {
        if (isValidNum(etA.getText().toString()) && (isValidNum(etB.getText().toString())) && (isValidNum(etC.getText().toString()))) {
            a = Double.parseDouble(etA.getText().toString());
            b = Double.parseDouble(etB.getText().toString());
            c = Double.parseDouble(etC.getText().toString());
            Intent intent = new Intent(MainActivity.this, results.class);
            intent.putExtra("a", a);
            intent.putExtra("b", b);
            intent.putExtra("c", c);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "ILLEGAL INPUT!", Toast.LENGTH_SHORT).show();
            a = 0;
            b = 0;
            c = 0;
        }
    }
}