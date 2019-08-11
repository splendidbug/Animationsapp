package com.example.android.animationsapp;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.transition.ChangeBounds;
import android.support.transition.Transition;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;
import io.netopen.hotbitmapgg.library.view.RingProgressBar;

public class PracticeActivity extends AppCompatActivity {

    CardView cardViewGame;
    ImageView game,trimg;
    TextView practice, games;
    CircleImageView circle;

    RingProgressBar ringProgressBar;
    int progress = 0;

    Handler myHandler = new Handler(){

        @Override
        public void handleMessage(Message msg) {

            if(msg.what==0)
            {
                if(progress<90)
                {
                    progress++;
                    ringProgressBar.setProgress(progress);

                }
            }


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_practice);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);

        menuItem.setChecked(true);

        cardViewGame = findViewById(R.id.cardViewGame);
        game = findViewById(R.id.game);
        practice = findViewById(R.id.practice);
        games = findViewById(R.id.games);
        trimg = findViewById(R.id.trimg);



        circle = findViewById(R.id.profile_image);
        cardViewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameintent = new Intent(PracticeActivity.this, GamingAnimationsActivity.class);


                Pair[] pairs = new Pair[5];
                pairs[0] = new Pair<View,String>(game, "image");
                pairs[1] = new Pair<View,String>(practice, "tv1");
                pairs[2] = new Pair<View,String>(games, "tv2");
                pairs[3] = new Pair<View,String>(trimg, "triangle");
                pairs[4] = new Pair<View,String>(circle, "circle");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(PracticeActivity.this,pairs);

                startActivity(gameintent, options.toBundle());

            }
        });

        ringProgressBar = findViewById(R.id.progress_bar_1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++)
                {
                    try
                    {
                        Thread.sleep(60);
                        myHandler.sendEmptyMessage(0);
                    }catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.nav_lesson:

                        Intent intent1 = new Intent(PracticeActivity.this, MainActivity.class);
                        startActivity(intent1);
                        ((Activity) PracticeActivity.this).overridePendingTransition(0,0);
                        break;

                    case R.id.nav_allLessons:

                        Intent intent2 = new Intent(PracticeActivity.this, AllLessonsActivity.class);
                        startActivity(intent2);
                        ((Activity) PracticeActivity.this).overridePendingTransition(0,0);
                        break;
                    case R.id.nav_progress:

                        Intent intent3 = new Intent(PracticeActivity.this, ProgressActivity.class);
                        startActivity(intent3);
                        ((Activity) PracticeActivity.this).overridePendingTransition(0,0);
                        break;
//                case R.id.nav_practice:
//
//                    break;
                case R.id.nav_premium:
                    Intent intent5 = new Intent(PracticeActivity.this, PremiumActivity.class);
                    startActivity(intent5);
                    ((Activity) PracticeActivity.this).overridePendingTransition(0,0);
                    break;


                }
                return false;
            }
        });
    }


    }

