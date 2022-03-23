package com.example.lostarkscheduler;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNV;
    LinearLayout homeworkLayout, schedulerLayout, teamSchedulerLayout, myPageLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNV = findViewById(R.id.bottom_navigation);

        homeworkLayout = (LinearLayout) findViewById(R.id.homework);
        schedulerLayout = (LinearLayout) findViewById(R.id.schedulerLayout);
        teamSchedulerLayout = (LinearLayout) findViewById(R.id.teamSchedulerLayout);
        myPageLayout = (LinearLayout) findViewById(R.id.myPageLayout);

        bottomNV.setOnItemSelectedListener(item -> {


            if (item.getItemId() == R.id.homework) {
                homeworkLayout.setVisibility(View.VISIBLE);
                schedulerLayout.setVisibility(View.INVISIBLE);
                teamSchedulerLayout.setVisibility(View.INVISIBLE);
                myPageLayout.setVisibility(View.INVISIBLE);
            }
            if (item.getItemId() == R.id.scheduler) {
                homeworkLayout.setVisibility(View.INVISIBLE);
                schedulerLayout.setVisibility(View.VISIBLE);
                teamSchedulerLayout.setVisibility(View.INVISIBLE);
                myPageLayout.setVisibility(View.INVISIBLE);

            }
            if (item.getItemId() == R.id.teamScheduler) {
                homeworkLayout.setVisibility(View.INVISIBLE);
                schedulerLayout.setVisibility(View.INVISIBLE);
                teamSchedulerLayout.setVisibility(View.VISIBLE);
                myPageLayout.setVisibility(View.INVISIBLE);

            }
            if (item.getItemId() == R.id.myPage) {
                homeworkLayout.setVisibility(View.INVISIBLE);
                schedulerLayout.setVisibility(View.INVISIBLE);
                teamSchedulerLayout.setVisibility(View.INVISIBLE);
                myPageLayout.setVisibility(View.VISIBLE);

            }
            return true;
        });


    }
}