package com.example.daniel.w2d1_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MyPreferencesActivity.class);
        startActivity(intent);
    }
}


/*
References:
    http://alvinalexander.com/android/android-tutorial-preferencescreen-preferenceactivity-preferencefragment
    http://www.cs.dartmouth.edu/~campbell/cs65/lecture12/lecture12.html
 */