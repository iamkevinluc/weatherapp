package com.example.weatherapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.adapters.ForecastListAdapter
import com.example.weatherapp.R

class MainActivity : AppCompatActivity() {
    private val items = listOf(
        "Mon 6/23 - Sunny 31/17",
        "Tue 6/24 - Rain 17/10",
        "Wed 6/25 - Cloudy 21/15"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)

        forecastList.adapter =
            ForecastListAdapter(items)
    }

}
