package com.example.android.animationsapp;

import android.app.SharedElementCallback;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;

public class GamingAnimationsActivity extends AppCompatActivity {

    LinearLayout one, two, three, four, five;
    Animation fade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_games);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        fade = AnimationUtils.loadAnimation(this, R.anim.linear_layouts_second_act);


        getWindow().getSharedElementEnterTransition().setDuration(1000);


        //one.startAnimation(fade);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                one.setAlpha(1);
                one.startAnimation(fade);
            }
        }, 1500);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                two.setAlpha(1);
                two.startAnimation(fade);
            }
        }, 2500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                three.setAlpha(1);
                three.startAnimation(fade);
            }
        }, 3500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                four.setAlpha(1);
                four.startAnimation(fade);
            }
        }, 4500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                five.setAlpha(1);
                five.startAnimation(fade);
            }
        }, 5500);


    //    two.animate().setStartDelay(1000).alpha(1).setDuration(1000).translationYBy(10000f).start();

    }
}
