package com.aelliott.testmavenproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aelliott.samplelibrary.stuff;

public class MainActivity extends AppCompatActivity
{
    stuff stuf;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stuf = new stuff();

        Button buttonGreet = (Button)findViewById(R.id.buttonGreet);
        buttonGreet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, stuf.greet("Addison Elliott"), Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "12 + 24 = " + stuf.add(12, 24),
                        Toast.LENGTH_LONG).show();
            }
        });

        Button buttonSubtract = (Button)findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "12 - 6 = " + stuf.subtract(12, 6),
                        Toast.LENGTH_LONG).show();
            }
        });

        Button buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "3 * 5 = " + stuf.multiply(3, 5),
                        Toast.LENGTH_LONG).show();
            }
        });

        Button buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "20 / 3 = " + stuf.divide(20, 3),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
