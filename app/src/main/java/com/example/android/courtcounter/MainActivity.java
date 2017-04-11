package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;


    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }
    /**

     * Increases the score for team a by 6 points.

     */

    public void addSixForTeamA(View view) {

        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);



    }
    /**

     * Increases the score for team a by 3 points.

     */

    public void addThreeForTeamA(View view) {

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);


    }
    /**

     * Increases the score for team a by 1 point.

     */

    public void addOneForTeamA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);


    }
    /**

     * Increases the score for team a by 2 point.

     */

    public void addTwoForTeamA(View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);


    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**

     * Increases the score for team b by 6 points.

     */

    public void addSixForTeamB(View view) {

        scoreTeamB = scoreTeamB+ 6;
        displayForTeamB(scoreTeamB);



    }
    /**

     * Increases the score for team b by 3 points.

     */

    public void addThreeForTeamB(View view) {

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);


    }
    /**

     * Increases the score for team b by 1 point.

     */

    public void addOneForTeamB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);


    }
    /**

     * Increases the score for team b by 2 point.

     */

    public void addTwoForTeamB(View view) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);


    }
    /**

     * Resets score for Team A and B to 0

     */

    public void reset(View view) {

        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);


    }
}
