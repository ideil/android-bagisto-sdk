package com.ideil.bagistosdk.api

import com.ideil.bagistosdk.BagistoConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.RuntimeException

/**
 * Basket retrofit manager
 * */
object BagistoRetrofitManager {

    /**
     * Get configured retrofit instance
     *
     * @return [Retrofit]
     * */
    fun getRetrofit(): Retrofit {
        if (BagistoConfig.baseUrl.isEmpty())
            throw RuntimeException("Specify BasketConfig.baseUrl")

        return Retrofit.Builder()
            .baseUrl(BagistoConfig.baseUrl)
            .client(BagistoOkHttpProvider.createOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}