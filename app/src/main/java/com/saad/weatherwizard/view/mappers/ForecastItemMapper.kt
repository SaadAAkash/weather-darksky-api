package com.saad.weatherwizard.view.mappers

import com.saad.weatherwizard.model.Data


class ForecastItemMapper(forecast: Data) {

    var weatherDescription = "NA"
    var iconName = ""
    var celsiusTemperature = "NA"
    var humidity = "NA"
    var wind = "NA"
    var dateTimeString = "NA"

    private val fahrenheitLow = forecast.apparentTemperatureLow
    private val fahrenheitHigh = forecast.apparentTemperatureHigh
    private val fahrenheit = (fahrenheitLow + fahrenheitHigh) / 2

    init {
        celsiusTemperature = ForecastCommonMapper.fahrenheitToCelsius(fahrenheit)
        dateTimeString = ForecastCommonMapper.timestampToDate(forecast.time.toLong())
        iconName = ForecastCommonMapper.dayConditionToIcon(forecast.icon)
        weatherDescription = ForecastCommonMapper.getWeatherDescription(forecast.icon)
        humidity = ForecastCommonMapper.calculateHumidity(forecast.humidity)
        wind = ForecastCommonMapper.calculateWind(forecast.windSpeed)
    }
}