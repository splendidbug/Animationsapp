package com.example.android.animationsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class LessonsActivity extends AppCompatActivity {

    Animation fade;
    TextView tv_lessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_lesson);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

    tv_lessons = findViewById(R.id.tv_lessons);
        fade = AnimationUtils.loadAnimation(this, R.anim.linear_layouts_second_act);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                tv_lessons.setAlpha(1);
                tv_lessons.startAnimation(fade);
            }
        }, 0);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
//                    case R.id.nav_lesson:
//
//                        Intent intent1 = new Intent(LessonsActivity.this, LessonsActivity.class);
//                        Toast.makeText(LessonsActivity.this, "Activity changed", Toast.LENGTH_SHORT).show();
//                        startActivity(intent1);
//
//                        break;

                    case R.id.nav_allLessons:

                        Intent intent2 = new Intent(LessonsActivity.this, AllLessonsActivity.class);

                        startActivity(intent2);
                        ((Activity) LessonsActivity.this).overridePendingTransition(0,0);
                        break;
                    case R.id.nav_progress:

                        Intent intent3 = new Intent(LessonsActivity.this, ProgressActivity.class);
                        startActivity(intent3);
                        ((Activity) LessonsActivity.this).overridePendingTransition(0,0);
                        break;
                case R.id.nav_practice:
                    Intent intent4 = new Intent(LessonsActivity.this, PracticeActivity.class);
                    startActivity(intent4);
                    ((Activity) LessonsActivity.this).overridePendingTransition(0,0);
                    break;
                case R.id.nav_premium:
                    Intent intent5 = new Intent(LessonsActivity.this, ProgressActivity.class);
                    startActivity(intent5);
                    ((Activity) LessonsActivity.this).overridePendingTransition(0,0);
                    break;

                }
                return false;
            }
        });
    }
    }

