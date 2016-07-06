package com.example.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Natarajan on 7/6/2016.
 */
public class JokeDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("Joke");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(joke);
    }
}
