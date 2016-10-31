package com.example.daniel.w2d1_homework;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.overflow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}


/*
References:
    http://alvinalexander.com/android/android-tutorial-preferencescreen-preferenceactivity-preferencefragment
    http://www.cs.dartmouth.edu/~campbell/cs65/lecture12/lecture12.html
    https://www.youtube.com/watch?v=SF3Hh31clqQ
    http://www.techotopia.com/index.php/Creating_and_Managing_Overflow_Menus_on_Android
 */