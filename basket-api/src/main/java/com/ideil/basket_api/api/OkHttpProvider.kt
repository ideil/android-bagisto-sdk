package com.ideil.basket_api.api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * OkHttp provider for creating clients
 * */
object OkHttpProvider {

    /**
     * Creates OkHttp client
     *
     * @return [OkHttpClient]
     * */
    fun createOkHttpClient(): OkHttpClient {

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val builder = OkHttpClient.Builder()
            .addInterceptor(addQueryParameterInterceptor())
            .connectTimeout(40L, TimeUnit.SECONDS)
            .readTimeout(40L, TimeUnit.SECONDS)
            .writeTimeout(40L, TimeUnit.SECONDS)

        builder.addInterceptor(httpLoggingInterceptor)

        return builder.build()
    }

    /**
     * Add query parameter interceptor
     *
     * @return [Interceptor]
     * */
    private fun addQueryParameterInterceptor(): Interceptor {
        return Interceptor { chain ->
            val originalRequest = chain.request()
            val request: Request
            val modifiedUrl = originalRequest.url.newBuilder()
                .build()
            request = originalRequest.newBuilder().url(modifiedUrl).build()
            chain.proceed(request)
        }
    }

}