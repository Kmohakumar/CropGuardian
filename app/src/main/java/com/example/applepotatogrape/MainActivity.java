package com.example.applepotatogrape;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.applepotatogrape.activities.AppleDetection;
import com.example.applepotatogrape.activities.GrapeDetection;
import com.example.applepotatogrape.activities.PotatoDetection;
import com.example.applepotatogrape.bottomactivities.PrecautionsActivity;
import com.example.applepotatogrape.bottomactivities.WeatherActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout contentView;

    CardView appleCard, potatoCard, grapeCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        appleCard = findViewById(R.id.appleCard);
        potatoCard = findViewById(R.id.potatoCard);
        grapeCard = findViewById(R.id.grapeCard);

        startActivties();

        contentView = findViewById(R.id.content_view);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.detect);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.detect:
                                return true;
                            case R.id.remedies:
                                MainActivity.this.startActivity(new Intent(MainActivity.this,
                                        PrecautionsActivity.class));
                                MainActivity.this.finish();
                                MainActivity.this.overridePendingTransition(0, 0);
                                return true;
                            case R.id.weather:
                                MainActivity.this.startActivity(new Intent(MainActivity.this,
                                        WeatherActivity.class));
                                MainActivity.this.finish();
                                MainActivity.this.overridePendingTransition(0, 0);
                                return true;
                        }
                        return false;
                    }
                });
    }


    private void startActivties() {
        appleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AppleDetection.class));
            }
        });

        potatoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PotatoDetection.class));
            }
        });

        grapeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GrapeDetection.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void gotofruitsClassification(View view) {
        startActivity(new Intent(MainActivity.this, FruitsClassification.class));
    }

    public void gotoVegClassification(View view) {
        startActivity(new Intent(MainActivity.this, VegClassification.class));
    }
}