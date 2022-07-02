package com.govindsingh.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class three extends AppCompatActivity {

    public void b1(View view)
    {
        Intent intent = new Intent(this,i1.class);
        startActivity(intent);

    }
    public void b2(View view)
    {
        Intent intent = new Intent(this,i2.class);
        startActivity(intent);

    }
    public void b3(View view)
    {
        Intent intent = new Intent(this,i3.class);
        startActivity(intent);

    }
    public void b4(View view)
    {
        Intent intent = new Intent(this,i4.class);
        startActivity(intent);

    }
    public void b5(View view)
    {
        Intent intent = new Intent(this,i5.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
}