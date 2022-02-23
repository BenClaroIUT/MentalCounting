package com.example.mentalcounting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Jouer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeu);

        Button Score = findViewById(R.id.score2);

        Score.setOnClickListener(view -> openScore());


    }
    private void openScore() {
        Intent intent = new Intent(this, Score.class);
        startActivity(intent);
    }
}