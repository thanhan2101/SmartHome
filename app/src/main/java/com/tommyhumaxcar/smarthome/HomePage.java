package com.tommyhumaxcar.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

public class HomePage extends AppCompatActivity {
    private final String TAG = "HomePage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //add toolbar as actionbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TemperatureFragment temperatureFragment = TemperatureFragment.getInstance();

        //add fragment
        loadFragment(temperatureFragment, "", "");
    }

    private void loadFragment(Fragment fragment, String tag, String backStackName) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameFragment, fragment , tag)
                .addToBackStack(backStackName)
                .commit();
    }
}