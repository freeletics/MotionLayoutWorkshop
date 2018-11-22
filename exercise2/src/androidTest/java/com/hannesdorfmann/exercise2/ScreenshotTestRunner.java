package com.hannesdorfmann.exercise2;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import com.facebook.testing.screenshot.ScreenshotRunner;

public class ScreenshotTestRunner extends AndroidJUnitRunner {

    @Override
    public void onCreate(Bundle args) {
        super.onCreate(args);
        ScreenshotRunner.onCreate(this, args);
    }

    @Override
    public void finish(int resultCode, Bundle results) {
        ScreenshotRunner.onDestroy();
        super.finish(resultCode, results);
    }
}
