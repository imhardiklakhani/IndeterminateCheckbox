package com.android.tristatescheckbox.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.tristatescheckbox.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listener()
    }

    private fun listener() {
        checkbox.setOnClickListener {
            tv_state.text = when (checkbox.getState()) {
                0 -> "Unchecked"
                1 -> "Indeterminate"
                2 -> "Checked"
                else -> "None"
            }
        }
    }
}