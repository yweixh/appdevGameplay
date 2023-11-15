package com.example.gameplay_appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        // Find the TextView to display the score
        TextView scoreTextView = findViewById(R.id.ScoreResult);

        // Get the score from the intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("SCORE")) {
            int score = intent.getIntExtra("SCORE", 0);

            // Display the score in the TextView
            scoreTextView.setText("" + score);
        }
    }
}