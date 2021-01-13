package com.ideil.basket_api

class BasketConfig {
    companion object {

        /**
         * Base api url (host)
         * */
        internal var baseUrl: String = ""


        /**
         * Configure config
         * */
        fun configure(baseUrl: String) {
            this.baseUrl = baseUrl
            BasketApi.setupRetrofit()
        }

    }
}