package com.ideil.basket_api.api

import com.ideil.basket_api.BasketConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.RuntimeException

/**
 * Basket retrofit manager
 * */
object BasketRetrofitManager {

    /**
     * Get configured retrofit instance
     *
     * @return [Retrofit]
     * */
    fun getRetrofit(): Retrofit {
        if (BasketConfig.baseUrl.isEmpty())
            throw RuntimeException("Specify BasketConfig.baseUrl")

        return Retrofit.Builder()
            .baseUrl(BasketConfig.baseUrl)
            .client(OkHttpProvider.createOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}