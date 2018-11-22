package com.hannesdorfmann.exercise2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_ex2.detailsList
import kotlinx.android.synthetic.main.activity_ex2.mainList
import kotlinx.android.synthetic.main.activity_ex2.motionLayout

class Ex2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2)

        mainList.adapter = SimpleListAdapter(inflater = layoutInflater, layout = R.layout.item_list)
        mainList.layoutManager = LinearLayoutManager(this)

        detailsList.adapter =
                SimpleListAdapter(inflater = layoutInflater, layout = R.layout.item_list_detail)
        detailsList.layoutManager = LinearLayoutManager(this)
    }

    fun animationProgress(progress : Float){
        runOnUiThread {
            motionLayout.progress = progress
        }
    }
}
