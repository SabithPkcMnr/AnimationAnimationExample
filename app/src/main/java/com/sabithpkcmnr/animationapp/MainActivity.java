package com.sabithpkcmnr.animationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.textView);

        Animation myAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myslide_animation);

        myTextView.setAnimation(myAnimation);

        myAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

                Toast.makeText(MainActivity.this, "Animation started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Toast.makeText(MainActivity.this, "Animation finished", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

                Toast.makeText(MainActivity.this, "Animation repeating", Toast.LENGTH_SHORT).show();
            }
        });
    }
}