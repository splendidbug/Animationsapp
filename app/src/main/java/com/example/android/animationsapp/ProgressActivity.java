package com.example.android.animationsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_progress);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);




        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.nav_lesson:

                        Intent intent1 = new Intent(ProgressActivity.this, MainActivity.class);
                        Toast.makeText(ProgressActivity.this, "Activity changed", Toast.LENGTH_SHORT).show();
                        startActivity(intent1);

                        break;

                    case R.id.nav_allLessons:

                        Intent intent2 = new Intent(ProgressActivity.this, AllLessonsActivity.class);
                        Toast.makeText(ProgressActivity.this, "Activity changed", Toast.LENGTH_SHORT).show();
                        startActivity(intent2);
                        break;
//                    case R.id.nav_progress:
//
//                        Intent intent3 = new Intent(context, MainActivity.class);
//                        context.startActivity(intent3);
//                        break;
                case R.id.nav_practice:
                    Intent intent4 = new Intent(ProgressActivity.this, PracticeActivity.class);

    
                    startActivity(intent4);
                    break;
                case R.id.nav_premium:
                    Intent intent5 = new Intent(ProgressActivity.this, PremiumActivity.class);
                    Toast.makeText(ProgressActivity.this, "Activity changed", Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                    break;


                }
                return false;
            }
        });
    }
    }

