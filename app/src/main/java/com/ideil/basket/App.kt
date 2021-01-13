package com.ideil.basket

import android.app.Application
import com.ideil.basket_api.BasketConfig

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        BasketConfig.configure("https://bagisto.ideil.dev/")
    }

}