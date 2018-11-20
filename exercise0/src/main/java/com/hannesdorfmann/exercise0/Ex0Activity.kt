package com.hannesdorfmann.exercise0

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ex0.motionLayout
import kotlinx.android.synthetic.main.activity_ex0.progress

class Ex0Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex0)

        progress.setOnClickListener {
            motionLayout.progress = motionLayout.progress + 0.1f
        }
    }
}
