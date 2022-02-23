package com.example.mentalcounting;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Score extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scores);

        Button previous_button = findViewById(R.id.retourscore);
        previous_button.setOnClickListener(view -> goToMainActivity());
        
    }

    private void goToMainActivity() {
        finish();
    }

}
