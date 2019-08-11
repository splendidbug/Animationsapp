package com.example.android.animationsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AllLessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_all_lessons);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.nav_lesson:

                        Intent intent1 = new Intent(AllLessonsActivity.this, LessonsActivity.class);
                        startActivity(intent1);
                        ((Activity) AllLessonsActivity.this).overridePendingTransition(0,0);

                        break;

//                    case R.id.nav_allLessons:
//
//                        Intent intent2 = new Intent(AllLessonsActivity.this, AllLessonsActivity.class);
//                        Toast.makeText(AllLessonsActivity.this, "Activity changed", Toast.LENGTH_SHORT).show();
//                        startActivity(intent2);
//                        break;
                    case R.id.nav_progress:

                        Intent intent3 = new Intent(AllLessonsActivity.this, ProgressActivity.class);
                        startActivity(intent3);
                        ((Activity) AllLessonsActivity.this).overridePendingTransition(0,0);
                        break;
                case R.id.nav_practice:
                    Intent intent4 = new Intent(AllLessonsActivity.this, PracticeActivity.class);
                    startActivity(intent4);
                    ((Activity) AllLessonsActivity.this).overridePendingTransition(0,0);
                    break;
                case R.id.nav_premium:
                    Intent intent5 = new Intent(AllLessonsActivity.this, ProgressActivity.class);
                    startActivity(intent5);
                    ((Activity) AllLessonsActivity.this).overridePendingTransition(0,0);
                    break;

                }
                return false;
            }
        });
    }
    }

