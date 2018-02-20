package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void threepointer(View view)
    {
        scoreTeamA= scoreTeamA+1;
        displayForTeamA( scoreTeamA);

    }
    public void twopointer(View view)
    {
        scoreTeamA= scoreTeamA+1;
        displayForTeamA( scoreTeamA);

    }
    public void freethrow(View view)
    {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);

    }
    public void three(View view)
    {
        scoreTeamB= scoreTeamB+1;
        displayForTeamB( scoreTeamB);

    }
    public void two(View view)
    {
        scoreTeamB= scoreTeamB+1;
        displayForTeamB( scoreTeamB);

    }
    public void free(View view)
    {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);

    }
    public void resetS(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
