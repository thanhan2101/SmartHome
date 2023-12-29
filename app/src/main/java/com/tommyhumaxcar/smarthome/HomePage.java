package com.tommyhumaxcar.smarthome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {
    private final String TAG = "HomePage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //add toolbar as actionbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //add temperature fragment
        TemperatureFragment temperatureFragment = TemperatureFragment.getInstance();
        loadFragment(temperatureFragment, "", "");

        //add aqi fragment
        AqiFragment aqiFragment = AqiFragment.getInstance();
        loadFragment(aqiFragment, "", "");

        //add air humidity fragment
        AirHumidityFragment airHumidityFragment = AirHumidityFragment.getInstance();
        loadFragment(airHumidityFragment, "", "");

        //add light intensity fragment
        LightIntensity lightIntensity = LightIntensity.getInstance();
        loadFragment(lightIntensity, "", "");

        //add room fragment
        RoomFragment roomFragment = RoomFragment.getInstance();
        loadFragment(roomFragment, "", "");

        String str1 = "user";
        String str2 = "home";
        String str3 = "setting";

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationBar);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                final int i = item.getItemId();
                int a = Integer.valueOf(R.id.person);
                int b = Integer.valueOf(R.id.home);
                int c = Integer.valueOf(R.id.settings);

                if(item.getItemId() == R.id.person) {
                    Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_SHORT).show();
                } else if (i == b) {
                    Toast.makeText(getApplicationContext(), str2, Toast.LENGTH_SHORT).show();
                } else if (i == c) {
                    Toast.makeText(getApplicationContext(), str3, Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

    }

    private void loadFragment(Fragment fragment, String tag, String backStackName) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameFragment, fragment , tag)
                .addToBackStack(backStackName)
                .commit();
    }
}