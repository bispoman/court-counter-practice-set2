package com.exemple.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsForA = 0;
    int pointsForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void threePointsA(View v) {
        pointsForA = pointsForA+3;
        displayforTeamA();
    }

    public void twoPointsA(View v) {
        pointsForA = pointsForA+2;
        displayforTeamA();
    }

    public void freeThrowA(View v) {
        pointsForA = ++pointsForA;
        displayforTeamA();
    }

    void displayforTeamA() {
        TextView Scoreview = (TextView) findViewById(R.id.pointcountfora);
        Scoreview.setText(String.valueOf(pointsForA));
    }
    public void threePointsB(View v) {
        pointsForB = pointsForB+3;
        displayforTeamB();
    }

    public void twoPointsB(View v) {
        pointsForB = pointsForB+2;
        displayforTeamB();
    }

    public void freeThrowB(View v) {
        pointsForB = ++pointsForB;
        displayforTeamB();
    }

    void displayforTeamB() {
        TextView Scoreview = (TextView) findViewById(R.id.pointcountforb);
        Scoreview.setText(String.valueOf(pointsForB));
    }
}
