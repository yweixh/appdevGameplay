package com.example.gameplay_appdev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class chooseDifficulty extends AppCompatActivity {

    Button easyBtn, averageBtn, difficultBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_difficulty);

        easyBtn = findViewById(R.id.EasyBtn);
        averageBtn = findViewById(R.id.AverageBtn);
        difficultBtn = findViewById(R.id.DifficultBtn);


        easyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameplay = new Intent(chooseDifficulty.this, easy_gameplay.class);
                startActivity(gameplay);
            }
        });

        averageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameplay = new Intent(chooseDifficulty.this, average_gameplay.class);
                startActivity(gameplay);
            }
        });

        difficultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameplay = new Intent(chooseDifficulty.this, difficult_gameplay.class);
                startActivity(gameplay);
            }
        });
    }
}