package com.example.ex13;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class results extends AppCompatActivity {
    double a, b, c;
    TextView tvSolution;
    double dis;
    ImageView ivGraph;
    double root1, root2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvSolution = findViewById(R.id.tvSolution);
        ivGraph = findViewById(R.id.ivGraph);

        a = getIntent().getDoubleExtra("a", 0);
        b = getIntent().getDoubleExtra("b", 0);
        c = getIntent().getDoubleExtra("c", 0);

        dis = b * b - 4 * a * c;

        if (dis > 0)
        {
            root1 = (-b + Math.sqrt(dis)) / (2 * a);
            root2 = (-b - Math.sqrt(dis)) / (2 * a);
            tvSolution.setText("X1 = " + root1 + "\n X2 = " + root2);
            if (a > 0)
            {
                ivGraph.setImageResource(R.drawable.p2s);
            }
            else
            {
                ivGraph.setImageResource(R.drawable.n2s);
            }
        }

        else if (dis == 0)
        {
            root1 = -b / (2 * a);
            tvSolution.setText("X = " + root1);
            if (a > 0)
            {
                ivGraph.setImageResource(R.drawable.p1s);
            }
            else
            {
                ivGraph.setImageResource(R.drawable.n1s);
            }
        }

        else if (dis < 0)
        {
            tvSolution.setText("NO SOLUTIONS!");
            if (a > 0)
            {
                ivGraph.setImageResource(R.drawable.p0s);
            } else
            {
                ivGraph.setImageResource(R.drawable.n0s);
            }
        }
    }
    public void clickedBack (View view)
    {
        finish();
    }
}