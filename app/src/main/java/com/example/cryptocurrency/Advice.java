package com.example.cryptocurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Advice extends AppCompatActivity {

    TextView txtadvice1,txtadvice2,txtadvice3;
    ImageView imgadvice,imgadvice2,imgadvice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        imgadvice = findViewById(R.id.imgadvice);
        imgadvice2 = findViewById(R.id.imgadvice2);
        imgadvice3 = findViewById(R.id.imgadvice3);


        txtadvice1 = findViewById(R.id.txtadvice1);
        txtadvice2 = findViewById(R.id.txtadvice2);
        txtadvice3 = findViewById(R.id.txtadvice3);

        txtadvice1.setMovementMethod(new ScrollingMovementMethod());
        txtadvice2.setMovementMethod(new ScrollingMovementMethod());
        txtadvice3.setMovementMethod(new ScrollingMovementMethod());

    }
}
