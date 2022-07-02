package com.govindsingh.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quiz extends AppCompatActivity implements View.OnClickListener {
    public CardView card1,card2,card3,card4,card5,card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        card1 = (CardView)findViewById(R.id.a1);
        card2 = (CardView)findViewById(R.id.a2);
        card3 = (CardView)findViewById(R.id.a3);
        card4 = (CardView)findViewById(R.id.a4);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    public void onClick(View v) {

        Intent i;
        switch (v.getId())
        {
            case R.id.a1:
                i = new Intent(this,a.class);
                startActivity(i);
                break;

            case R.id.a2:
                i = new Intent(this,b.class);
                startActivity(i);
                break;

            case R.id.a3:
                i = new Intent(this,c.class);
                startActivity(i);
                break;

            case R.id.a4:
                i = new Intent(this,d.class);
                startActivity(i);
                break;


        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}