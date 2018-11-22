package com.hannesdorfmann.motionlayout.exercise1

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.facebook.testing.screenshot.Screenshot
import com.hannesdorfmann.exercise2.Ex2Activity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ScreenshotTest {

    @get:Rule
    val activityTestRule = ActivityTestRule(Ex2Activity::class.java, false, true)

    @Test
    fun takeScreenshot() {
        val activity = activityTestRule.activity
        activity.screenShot(0.0f)
        activity.screenShot(0.1f)
        activity.screenShot(0.2f)
        activity.screenShot(0.3f)
        activity.screenShot(0.4f)
        activity.screenShot(0.5f)
        activity.screenShot(0.6f)
        activity.screenShot(0.7f)
        activity.screenShot(0.8f)
        activity.screenShot(0.9f)
        activity.screenShot(1.0f)
    }

    private fun Ex2Activity.screenShot(progress: Float) {
        animationProgress(progress)
        Screenshot.snapActivity(this).setName("ex1-$progress").record()
    }
}
