package com.example.mentalcounting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Jouer = findViewById(R.id.play);
        Button Score = findViewById(R.id.score);

        Jouer.setOnClickListener(view -> openJouer());
        Score.setOnClickListener(view -> openScore());
    }

    private void openJouer() {
        Intent intent = new Intent(this, Jouer.class);
        startActivity(intent);
    }

    private void openScore() {
        Intent intent = new Intent(this, Score.class);
        startActivity(intent);
    }
}