package com.example.applepotatogrape.bottomactivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.applepotatogrape.MainActivity;
import com.example.applepotatogrape.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PrecautionsActivity extends AppCompatActivity {

    RelativeLayout contentView;

    ImageView upBtn1, upBtn2, upBtn3, upBtn4, upBtn5, upBtn6, upBtn7, upBtn8;
    ImageView downBtn1, downBtn2, downBtn3, downBtn4, downBtn5, downBtn6, downBtn7, downBtn8;

    LinearLayout brLL, escaLL, lsLL, appleScab, appleBR, appleCedar, potatoEarly, potatoLate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precautions);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        
        contentView = findViewById(R.id.content_view);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.remedies);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.detect:
                                PrecautionsActivity.this.startActivity(new Intent(PrecautionsActivity.this,
                                        MainActivity.class));
                                PrecautionsActivity.this.finish();
                                PrecautionsActivity.this.overridePendingTransition(0, 0);
                                return true;
                            case R.id.remedies:
                                return true;
                            case R.id.weather:
                                PrecautionsActivity.this.startActivity(new Intent(PrecautionsActivity.this,
                                        WeatherActivity.class));
                                PrecautionsActivity.this.finish();
                                PrecautionsActivity.this.overridePendingTransition(0, 0);
                                return true;
                        }
                        return false;
                    }
                });

        upBtn1 = findViewById(R.id.upArrow1);
        downBtn1 = findViewById(R.id.downArrow1);
        brLL = findViewById(R.id.blackRotLL);

        downBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn1.setVisibility(View.GONE);
                upBtn1.setVisibility(View.VISIBLE);
                brLL.setVisibility(View.VISIBLE);
                upBtn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn1.setVisibility(View.VISIBLE);
                        upBtn1.setVisibility(View.GONE);
                        brLL.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn2 = findViewById(R.id.upArrow2);
        downBtn2 = findViewById(R.id.downArrow2);
        escaLL = findViewById(R.id.escaLL);

        downBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn2.setVisibility(View.GONE);
                upBtn2.setVisibility(View.VISIBLE);
                escaLL.setVisibility(View.VISIBLE);
                upBtn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn2.setVisibility(View.VISIBLE);
                        upBtn2.setVisibility(View.GONE);
                        escaLL.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn3 = findViewById(R.id.upArrow3);
        downBtn3 = findViewById(R.id.downArrow3);
        lsLL = findViewById(R.id.lfLL);

        downBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn3.setVisibility(View.GONE);
                upBtn3.setVisibility(View.VISIBLE);
                lsLL.setVisibility(View.VISIBLE);
                upBtn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn3.setVisibility(View.VISIBLE);
                        upBtn3.setVisibility(View.GONE);
                        lsLL.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn4 = findViewById(R.id.upArrow4);
        downBtn4 = findViewById(R.id.downArrow4);
        appleScab = findViewById(R.id.appleScabLL);

        downBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn4.setVisibility(View.GONE);
                upBtn4.setVisibility(View.VISIBLE);
                appleScab.setVisibility(View.VISIBLE);
                upBtn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn4.setVisibility(View.VISIBLE);
                        upBtn4.setVisibility(View.GONE);
                        appleScab.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn5 = findViewById(R.id.upArrow5);
        downBtn5 = findViewById(R.id.downArrow5);
        appleBR = findViewById(R.id.appleBlackLL);

        downBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn5.setVisibility(View.GONE);
                upBtn5.setVisibility(View.VISIBLE);
                appleBR.setVisibility(View.VISIBLE);
                upBtn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn5.setVisibility(View.VISIBLE);
                        upBtn5.setVisibility(View.GONE);
                        appleBR.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn6 = findViewById(R.id.upArrow6);
        downBtn6 = findViewById(R.id.downArrow6);
        appleCedar = findViewById(R.id.appleCedarLL);

        downBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn6.setVisibility(View.GONE);
                upBtn6.setVisibility(View.VISIBLE);
                appleCedar.setVisibility(View.VISIBLE);
                upBtn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn6.setVisibility(View.VISIBLE);
                        upBtn6.setVisibility(View.GONE);
                        appleCedar.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn7 = findViewById(R.id.upArrow7);
        downBtn7 = findViewById(R.id.downArrow7);
        potatoEarly = findViewById(R.id.potatoEarlyLL);

        downBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn7.setVisibility(View.GONE);
                upBtn7.setVisibility(View.VISIBLE);
                potatoEarly.setVisibility(View.VISIBLE);
                upBtn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn7.setVisibility(View.VISIBLE);
                        upBtn7.setVisibility(View.GONE);
                        potatoEarly.setVisibility(View.GONE);
                    }
                });
            }
        });

        upBtn8 = findViewById(R.id.upArrow8);
        downBtn8 = findViewById(R.id.downArrow8);
        potatoLate = findViewById(R.id.potatoLateLL);

        downBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downBtn8.setVisibility(View.GONE);
                upBtn8.setVisibility(View.VISIBLE);
                potatoLate.setVisibility(View.VISIBLE);
                upBtn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        downBtn8.setVisibility(View.VISIBLE);
                        upBtn8.setVisibility(View.GONE);
                        potatoLate.setVisibility(View.GONE);
                    }
                });
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}