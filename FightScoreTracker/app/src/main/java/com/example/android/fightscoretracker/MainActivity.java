package com.example.android.fightscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreBoxerA = 10;
    int scoreBoxerB = 10;

    int roundsWonBoxerA = 0;
    int roundsWonBoxerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForBoxerA(10);
        displayForBoxerB(10);
        displayRoundsForBoxerA(0);
        displayRoundsForBoxerB(0);
    }

    /**The scoring system used in professional boxing is called the 10-Point Must System. These are the basics for scoring a round:

     Judges score on a 10-point scale. Most rounds will end 10-9, with the more dominant boxer receiving 10 points, the other receiving 9.
     If a boxer is knocked down, he loses a point. If a boxer is knocked down twice, he loses two points. If both fighters are knocked down, the knockdowns cancel each other out.
     While uncommon, if a fighter completely dominates a round but doesn’t score a knockdown, a judge can still score that round 10-8.
     If a judge deems the round completely even, both fighters receive 10 points.
     When the referee sees fit, he can take away a point or two for an intentional foul; he can do the same for unintentional ones, but that usually occurs after at least a warning.
     */


     /**
     * Boxer A gets knocked down.
     */
    public void knockdownForBoxerA(View view) {
        scoreBoxerA = scoreBoxerA - 1;
        displayForBoxerA(scoreBoxerA);
    }

    /**
     * Boxer A commits intentional foul.
     */
    public void intentionalFoulBoxerA(View view) {
        scoreBoxerA = scoreBoxerA - 1;
        displayForBoxerA(scoreBoxerA);
    }

    /**
     * Boxer A dominates round. Boxer B loses by two points.
     */
    public void dominateForBoxerA(View view) {
        scoreBoxerB = scoreBoxerB -2;
        displayForBoxerB(scoreBoxerB);
    }

    /**
     * Boxer A wins round.
     */

    public void roundWonForBoxerA(View view) {
        roundsWonBoxerA = roundsWonBoxerA + 1;
        displayRoundsForBoxerA(roundsWonBoxerA);
    }

    /**
     * Boxer B gets knocked down.
     */
    public void knockdownForBoxerB(View view) {
        scoreBoxerB = scoreBoxerB - 1;
        displayForBoxerB(scoreBoxerB);
    }

    /**
     * Boxer B commits intentional foul.
     */
    public void intentionalFoulBoxerB(View view) {
        scoreBoxerB = scoreBoxerB - 1;
        displayForBoxerB(scoreBoxerB);
    }

    /**
     * Boxer B dominates round. Boxer A loses by two points.
     */
    public void dominateForBoxerB(View view) {
        scoreBoxerA = scoreBoxerA -2;
        displayForBoxerA(scoreBoxerA);
    }

    /**
     * Boxer B wins round
     */
    public void roundWonForBoxerB(View view) {
        roundsWonBoxerB = roundsWonBoxerB + 1;
        displayRoundsForBoxerB(roundsWonBoxerB);
    }


    /**
     * Reset points for both teams to 0 points
     */
    public void resetRoundScore(View view) {
        scoreBoxerA = 10;
        displayForBoxerA(scoreBoxerA);

        scoreBoxerB = 10;
        displayForBoxerB(scoreBoxerB);
    }

    /**
     * Reset Whole Game.
     */
    public void resetPointsForGame(View view) {
        scoreBoxerA = 10;
        scoreBoxerB = 10;
        roundsWonBoxerA = 0;
        roundsWonBoxerB = 0;

        displayForBoxerA(scoreBoxerA);
        displayForBoxerB(scoreBoxerB);
        displayRoundsForBoxerA(roundsWonBoxerA);
        displayRoundsForBoxerB(roundsWonBoxerB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForBoxerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boxer_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForBoxerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boxer_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays rounds won for boxer A
     */
    public void displayRoundsForBoxerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boxer_a_rounds_won);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays rounds won for boxer B
     */
    public void displayRoundsForBoxerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boxer_b_rounds_won);
        scoreView.setText(String.valueOf(score));
    }

}
