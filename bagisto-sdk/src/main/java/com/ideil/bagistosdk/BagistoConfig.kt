package com.ideil.bagistosdk

/**
 * Basket config
 * */
object BagistoConfig {

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
        BagistoApi.setupRetrofit()
    }

}