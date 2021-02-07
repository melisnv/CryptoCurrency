package com.example.cryptocurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cryptocurrency.view.Cryptocurrency;

public class MainActivity extends AppCompatActivity {

    ImageView bannerimg,iconimg,iconimg2;
    TextView informationtxt,advicetxt,checkcurrencytxt;
    Button btnCheck,btnAdvice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // https://api.nomics.com/v1/prices?key=ae2e0d147b5e52eeff96f2432397ceac

        bannerimg = findViewById(R.id.bannerimg);
        informationtxt = findViewById(R.id.informationtxt);
        iconimg = findViewById(R.id.iconimg);
        iconimg2 = findViewById(R.id.iconimg2);
        advicetxt = findViewById(R.id.advicetxt);
        checkcurrencytxt =findViewById(R.id.checkcurrencytxt);
        btnAdvice = findViewById(R.id.btnAdvice);
        btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCheck = new Intent(MainActivity.this, Cryptocurrency.class);
                startActivity(intentCheck);
            }
        });

        btnAdvice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAdvice = new Intent(MainActivity.this,Advice.class);
                startActivity(intentAdvice);
            }
        });
    }
}
