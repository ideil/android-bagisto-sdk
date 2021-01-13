package com.ideil.basket_api

/**
 * Basket config
 * */
object BasketConfig {

    /**
     * Base api url (host)
     * */
    internal var baseUrl: String = ""


    /**
     * Configure config
     *
     * @param baseUrl Api server host
     * */
    fun configure(baseUrl: String) {
        this.baseUrl = baseUrl
        BasketApi.setupRetrofit()
    }

}