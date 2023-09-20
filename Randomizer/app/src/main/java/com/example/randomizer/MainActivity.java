package com.example.randomizer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton = findViewById(R.id.rollButton);
        final TextView resultsTextView = findViewById(R.id.resultsTextView);
        final SeekBar seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int maxLimit = seekBar.getProgress(); // Get the limit from the SeekBar
                int rand = new Random().nextInt(maxLimit + 1);
                resultsTextView.setText(String.valueOf(rand));
            }
        });
    }
}
