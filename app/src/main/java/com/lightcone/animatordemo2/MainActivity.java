package com.lightcone.animatordemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    MotionRunner2 mrunner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startAnimation();
    }

    @Override
    public void onPause() {
        super.onPause();
        // Stop animation if going into background
        mrunner.stopLooper();
    }

    @Override
    public void onResume() {
        super.onResume();
        // Resume animation
        startAnimation();
    }

    // Method to start the animation

    private void startAnimation(){
        // Instantiate the class MotionRunner to define the entry screen display
        mrunner = new MotionRunner2(this);
        mrunner.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(mrunner);
    }
}
