package com.hannesdorfmann.motionlayout.exercise1

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.facebook.testing.screenshot.Screenshot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class Example1Test {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, false, true)

    @Test
    fun useAppContext() {
        Screenshot.snapActivity(activityTestRule.activity).record()
    }
}
