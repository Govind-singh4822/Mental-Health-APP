package com.govindsingh.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginclicked(View view)
    {
        EditText usr = (EditText)findViewById(R.id.usr);
        EditText pass = (EditText)findViewById(R.id.pass);

        if(usr.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
        {
            Intent intent = new Intent(this,Mainpage.class);
            startActivity(intent);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}