package com.ideil.basket_api

import com.ideil.basket_api.api.BasketApiService
import com.ideil.basket_api.api.BasketRetrofitManager
import com.ideil.basket_api.entity.BasketCategoryApi
import com.ideil.basket_api.entity.response.GetCategoriesResponse
import retrofit2.Retrofit

class BasketApi {

    suspend fun getCategory(categoryId: Long): Result<List<BasketCategoryApi>> {
        return kotlin.runCatching { apiService.getCategoryById(categoryId.toString()) }
    }

    suspend fun getCategories(limit: Int, page: Int, pagination: Int): Result<GetCategoriesResponse> {
        return kotlin.runCatching {
            apiService.getCategories(limit.toString(), page.toString(), pagination.toString())
        }
    }

    suspend fun getCategoriesDescendant(parentId: Long): Result<List<BasketCategoryApi>> {
        return kotlin.runCatching { apiService.getCategoriesDescendant(parentId.toString()) }
    }

    suspend fun getProducts(categoryId: Long, limit: Int, page: Int): Result<Any> {
        return kotlin.runCatching { apiService.getProducts(categoryId, limit, page) }
    }


    companion object {
        lateinit var retrofit: Retrofit
        lateinit var apiService: BasketApiService

        internal fun setupRetrofit() {
            retrofit = BasketRetrofitManager.getRetrofit()
            apiService = retrofit.create(BasketApiService::class.java)
        }
    }

}