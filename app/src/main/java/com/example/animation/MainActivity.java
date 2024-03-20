package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView sharingan, dbz;
    private Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharingan = findViewById(R.id.sharingan);
        dbz = findViewById(R.id.dbz);
        btn = findViewById(R.id.btn);


    RotateAnimation rotateSharingan = new RotateAnimation(0,90,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF,0.5f);

    RotateAnimation rotateDbz = new RotateAnimation(0,90,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF,0.5f);

    rotateSharingan.setDuration(4000);
    rotateSharingan.setInterpolator(new LinearInterpolator());

    rotateDbz.setDuration(4000);
    rotateDbz.setInterpolator(new LinearInterpolator());

    // sharingan.startAnimation(rotateSharingan);
    // sharingan.startAnimation(rotateDbz);

    btn.setOnClickListener(v -> {
        sharingan.startAnimation(rotateSharingan);
        dbz.startAnimation(rotateDbz);
    });





    }
}