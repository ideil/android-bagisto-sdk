package com.ideil.bagistosdk

import android.app.Application

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        BagistoConfig.configure("https://bagisto.ideil.dev/")
    }

}