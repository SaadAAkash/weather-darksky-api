package com.saad.weatherwizard.view.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.saad.weatherwizard.model.TAG_O_BASE

@SuppressLint("Registered")

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG_O_BASE, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}