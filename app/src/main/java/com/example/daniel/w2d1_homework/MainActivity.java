package com.example.daniel.w2d1_homework;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
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
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadPreferences();
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
            case R.id.menu_settings:
                Intent intent = new Intent(getApplicationContext(), AppPreferences.class);
                startActivity(intent);
                Log.d(TAG, "onOptionsItemSelected: Settings");
            case R.id.menu_something:
                Log.d(TAG, "onOptionsItemSelected: Something");

            default:
                return super.onOptionsItemSelected(item);

        }

    }

    private void loadPreferences(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        boolean isEyeCarebckgrnd = sharedPreferences.getBoolean("eyecare_bkcgrnd", false);
        if (isEyeCarebckgrnd){
            LinearLayout mainLinearLayout = (LinearLayout) findViewById(R.id.m_logfragment);
            mainLinearLayout.setBackgroundColor(Color.parseColor("#9E9E9E"));
        }

        String logbookTitle = sharedPreferences.getString("title", "Logbook");
        setTitle(logbookTitle);
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
    https://www.youtube.com/watch?v=f-MaGDBD144
    https://www.youtube.com/watch?v=7Ma0ygAlgWc
    https://www.youtube.com/watch?v=7Ma0ygAlgWc
 */