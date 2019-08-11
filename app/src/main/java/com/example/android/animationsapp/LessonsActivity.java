package com.example.android.animationsapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class LessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_lesson);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);




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
                        Toast.makeText(LessonsActivity.this, "Activity changed", Toast.LENGTH_SHORT).show();
                        startActivity(intent2);
                        break;
                    case R.id.nav_progress:

                        Intent intent3 = new Intent(LessonsActivity.this, ProgressActivity.class);
                        startActivity(intent3);
                        break;
                case R.id.nav_practice:
                    Intent intent4 = new Intent(LessonsActivity.this, PracticeActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.nav_premium:
                    Intent intent5 = new Intent(LessonsActivity.this, ProgressActivity.class);
                    startActivity(intent5);
                    break;

                }
                return false;
            }
        });
    }
    }

