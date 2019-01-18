package com.saad.weatherwizard.view.activities

import android.os.Bundle
import android.util.Log
import com.saad.weatherwizard.R
import com.saad.weatherwizard.controller.LocalForecastData
import com.saad.weatherwizard.model.ForecastDataModel
import com.saad.weatherwizard.model.TAG_A_MAIN
import com.saad.weatherwizard.model.isErrorExecuted
import com.saad.weatherwizard.view.UserInterface


class MainActivity : BaseActivity() {
    private var storedForecastData: ForecastDataModel? = null
    private lateinit var userInterface: UserInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG_A_MAIN, "onCreate() is executed.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userInterface = UserInterface(this)
        storedForecastData = LocalForecastData(this).retrieve()
        if (storedForecastData != null) {
            Log.d(TAG_A_MAIN, "onResume() storedForecastData: $storedForecastData.")
            userInterface.updateUI(storedForecastData!!, false)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG_A_MAIN, "onResume() is executed.")
        if (!isErrorExecuted) {
            userInterface.initialize()
        }
    }

    override fun onPause() {
        super.onPause()
        isErrorExecuted = false
    }
}

