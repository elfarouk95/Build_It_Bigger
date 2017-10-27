package com.example.jokedisplyprovider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokedsip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokedsip =(TextView)findViewById(R.id.joketextview);
        String joke;
        Intent n =getIntent();
        joke=n.getStringExtra("joke");
        jokedsip.setText(joke);

    }
}
