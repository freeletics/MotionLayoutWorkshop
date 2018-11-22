package com.hannesdorfmann.exercise3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ex3.motionLayout

class Ex3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex3)
    }

    fun animationProgress(progress: Float) {
        runOnUiThread {
            motionLayout.progress = progress
        }
    }
}
