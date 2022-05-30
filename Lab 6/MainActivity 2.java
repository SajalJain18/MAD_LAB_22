package com.project_sajal.animation_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView2);
        imageView.animate().setDuration(2000).translationX(250);
        imageView.animate().setDuration(2000).translationY(250);
        imageView.animate().setDuration(2000).rotationX(360);

    }
}