package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore1;
    private int mScore2;
    private TextView mScore1Text;
    private TextView mScore2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore1Text = findViewById(R.id.score_1);
        mScore2Text = findViewById(R.id.score_2);


    }

    public void increaseScore(View view) {
        int viewID = view.getId();
        switch(viewID) {
            case R.id.increaseTeam1:
                mScore1++;
                mScore1Text.setText(String.valueOf(mScore1));
                break;
            case R.id.increaseTeam2:
                mScore2++;
                mScore2Text.setText(String.valueOf(mScore2));
                break;

        }
    }

    public void decreaseScore(View view) {
        int viewID = view.getId();
        switch(viewID) {
            case R.id.decreaseTeam1:
                mScore1--;
                mScore1Text.setText(String.valueOf(mScore1));
                break;
            case R.id.decreaseTeam2:
                mScore2--;
                mScore2Text.setText(String.valueOf(mScore2));
                break;

        }
    }
}