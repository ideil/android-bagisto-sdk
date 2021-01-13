package com.ideil.bagistosdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actions()
    }

    private fun actions() {
        runBlocking {
            BagistoApi().getProducts(16, 100, 1).process(
                {
                    Log.d("MainActivity", it.toString())
                },
                {
                    Log.d("MainActivity", "Failed", it)
                }
            )
        }
    }

}