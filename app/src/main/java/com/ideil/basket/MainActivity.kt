package com.ideil.basket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ideil.basket_api.BasketApi
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actions()
    }

    private fun actions() {
        runBlocking {
            BasketApi().getProducts(16, 100, 1).process(
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