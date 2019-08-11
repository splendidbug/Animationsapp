package com.example.android.animationsapp;

import android.app.SharedElementCallback;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.DecelerateInterpolator;

public class GamingAnimationsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_games);



        getWindow().getSharedElementEnterTransition().setDuration(1000);


    }
}
