package com.nahar.my_frist_project

import android.graphics.Color
import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat

class LauncherActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var progressBarAnimation: ProgressBarAnimation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        init()

        setProgressBarColor()

        setProgressing()

        animation()
    }

    private fun setProgressBarColor() {
        progressBar.progressDrawable.colorFilter =
            BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                Color.BLUE,
                BlendModeCompat.SRC_IN
            )
    }

    private fun setProgressing() {
        progressBar.max = 100
        progressBar.scaleY = 3f
    }

    private fun animation() {
        progressBarAnimation = ProgressBarAnimation(this, progressBar, 0f, 100f)
        progressBarAnimation.duration = 5000
        progressBar.animation = progressBarAnimation
    }

    private fun init() {
        progressBar = findViewById(R.id.progressbar)
    }
}