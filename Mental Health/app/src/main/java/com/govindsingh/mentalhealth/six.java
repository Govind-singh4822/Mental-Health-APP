package com.govindsingh.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class six extends AppCompatActivity {

    public void a1(View view)
    {
        Intent intent = new Intent(this,h1.class);
        startActivity(intent);

    }
    public void a2(View view)
    {
        Intent intent = new Intent(this,h2.class);
        startActivity(intent);

    }
    public void a3(View view)
    {
        Intent intent = new Intent(this,h3.class);
        startActivity(intent);

    }
    public void a4(View view)
    {
        Intent intent = new Intent(this,h4.class);
        startActivity(intent);

    }
    public void a5(View view)
    {
        Intent intent = new Intent(this,h5.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);


    }
}