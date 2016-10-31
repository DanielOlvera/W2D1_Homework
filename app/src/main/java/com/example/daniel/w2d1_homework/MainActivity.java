package com.example.daniel.w2d1_homework;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_rowing:
                Log.d(TAG, "onOptionsItemSelected: Rowing");
                Toast.makeText(getApplicationContext(), "Rowing touched!", Toast.LENGTH_SHORT).show();
            case R.id.menu_settings:
                Log.d(TAG, "onOptionsItemSelected: Settings");
                Toast.makeText(getApplicationContext(), "Settings touched!", Toast.LENGTH_SHORT).show();
            case R.id.menu_something:
                Log.d(TAG, "onOptionsItemSelected: Something");
                Toast.makeText(getApplicationContext(), "Something touched!", Toast.LENGTH_SHORT).show();

            default:
                return super.onOptionsItemSelected(item);

        }

    }
}


/*
References:
    http://alvinalexander.com/android/android-tutorial-preferencescreen-preferenceactivity-preferencefragment
    http://www.cs.dartmouth.edu/~campbell/cs65/lecture12/lecture12.html
    https://www.youtube.com/watch?v=SF3Hh31clqQ
    http://www.techotopia.com/index.php/Creating_and_Managing_Overflow_Menus_on_Android
    https://developer.android.com/guide/topics/ui/menus.html
    https://www.youtube.com/watch?v=ezE_SZRStmQ
 */