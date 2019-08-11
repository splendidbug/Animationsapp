package com.example.android.animationsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class PremiumActivity extends AppCompatActivity {

    Animation fade;
    TextView tv_premium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_premium);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        tv_premium = findViewById(R.id.tv_premium);
        fade = AnimationUtils.loadAnimation(this, R.anim.linear_layouts_second_act);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                tv_premium.setAlpha(1);
                tv_premium.startAnimation(fade);
            }
        }, 0);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.nav_lesson:

                        Intent intent1 = new Intent(PremiumActivity.this, MainActivity.class);
                        startActivity(intent1);
                        ((Activity) PremiumActivity.this).overridePendingTransition(0,0);
                        finish();
                        break;

                    case R.id.nav_allLessons:

                        Intent intent2 = new Intent(PremiumActivity.this, AllLessonsActivity.class);
                        startActivity(intent2);
                        ((Activity) PremiumActivity.this).overridePendingTransition(0,0);
                        finish();
                        break;
                    case R.id.nav_progress:

                        Intent intent3 = new Intent(PremiumActivity.this, ProgressActivity.class);
                        startActivity(intent3);
                        ((Activity) PremiumActivity.this).overridePendingTransition(0,0);
                        finish();
                        break;
                case R.id.nav_practice:
                    Intent intent4 = new Intent(PremiumActivity.this, PracticeActivity.class);
                    startActivity(intent4);
                    ((Activity) PremiumActivity.this).overridePendingTransition(0,0);
                    finish();
                    break;
//                case R.id.nav_premium:
//
//                    Intent intent5 = new Intent(PremiumActivity.this, ProgressActivity.class);
//                    startActivity(intent5);
//                    break;
//                    break;

                }
                return false;
            }
        });
    }
    }

