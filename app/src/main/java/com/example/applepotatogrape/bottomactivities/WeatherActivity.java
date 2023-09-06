package com.example.applepotatogrape.bottomactivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.applepotatogrape.MainActivity;
import com.example.applepotatogrape.R;
import com.example.applepotatogrape.activities.MainActivity2;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WeatherActivity extends AppCompatActivity {

    RelativeLayout contentView;
    Button weatherBtn;
    TextView currentTime, currentDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        contentView = findViewById(R.id.content_view);

        currentTime = findViewById(R.id.current_time);
        currentDate = findViewById(R.id.current_date);

        currentTime.setText(currentTime());
        currentDate.setText(currentDate());

        weatherBtn = findViewById(R.id.weather_btn);

        weatherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeatherActivity.this, MainActivity2.class));
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.weather);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.detect:
                                WeatherActivity.this.startActivity(new Intent(WeatherActivity.this,
                                        MainActivity.class));
                                WeatherActivity.this.finish();
                                WeatherActivity.this.overridePendingTransition(0, 0);
                                return true;
                            case R.id.remedies:
                                WeatherActivity.this.startActivity(new Intent(WeatherActivity.this,
                                        PrecautionsActivity.class));
                                WeatherActivity.this.finish();
                                WeatherActivity.this.overridePendingTransition(0, 0);
                                return true;
                            case R.id.weather:
                                return true;
                        }
                        return false;
                    }
                });
    }

    private String currentTime(){
        return new SimpleDateFormat("hh:mm a", Locale.getDefault()).format(new Date());
    }

    private String currentDate(){
        return new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}