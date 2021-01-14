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
            kotlin.runCatching { BagistoApi().getCategory(15) }.process(
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