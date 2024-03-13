package com.doaamosallam.splitifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import com.doaamosallam.splitifyapp.databinding.ActivitySplashScreenBinding
import com.doaamosallam.splitifyapp.ui.HomeFragment
import com.doaamosallam.splitifyapp.ui.MainActivity

class SplashScreen :BasicActivity<ActivitySplashScreenBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash_screen)
        binding.motionLayout.addTransitionListener(object :
            MotionLayout.TransitionListener {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                // Navigate to MainActivity or another destination when splash screen transition is completed
                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
                finish()
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
            }
        })
    }

    override fun getLayoutId()= R.layout.activity_splash_screen
}