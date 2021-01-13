package com.ideil.basket_api.api

import com.ideil.basket_api.BasketConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.RuntimeException

class BasketRetrofitManager {

    companion object {

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
}