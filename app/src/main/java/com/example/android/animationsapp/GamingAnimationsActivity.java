package com.example.android.animationsapp;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;

import com.hannesdorfmann.swipeback.Position;
import com.hannesdorfmann.swipeback.SwipeBack;

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

        SwipeBack.attach(this, Position.LEFT).setSwipeBackView(R.layout.swipeback_default);

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
        }, 1300);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                two.setAlpha(1);
                two.startAnimation(fade);
            }
        }, 2000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                three.setAlpha(1);
                three.startAnimation(fade);
            }
        }, 2700);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                four.setAlpha(1);
                four.startAnimation(fade);
            }
        }, 3400);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                five.setAlpha(1);
                five.startAnimation(fade);
            }
        }, 4100);


    //    two.animate().setStartDelay(1000).alpha(1).setDuration(1000).translationYBy(10000f).start();

    }



    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.swipeback_stack_to_front,
               R.anim.swipeback_stack_right_out);
        Intent intenta = new Intent(GamingAnimationsActivity.this, PracticeActivity.class);
        startActivity(intenta);
    }
}
