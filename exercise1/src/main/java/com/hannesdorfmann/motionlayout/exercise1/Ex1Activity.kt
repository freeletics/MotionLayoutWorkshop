package com.hannesdorfmann.motionlayout.exercise1

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_ex1.motionLayout

class Ex1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)
    }

    fun animationProgress(progress : Float){
        runOnUiThread {
            motionLayout.progress = progress
        }
    }
}
