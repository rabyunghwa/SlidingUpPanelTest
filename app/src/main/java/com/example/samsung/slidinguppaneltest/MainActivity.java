package com.example.samsung.slidinguppaneltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends AppCompatActivity {

    private SlidingUpPanelLayout mSlidingPaneLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlidingPaneLayout = findViewById(R.id.sliding_layout);

        mSlidingPaneLayout.setAnchorPoint(0.5f);
    }
}
