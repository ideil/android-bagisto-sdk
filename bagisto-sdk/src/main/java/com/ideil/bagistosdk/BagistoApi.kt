package com.ideil.bagistosdk

import com.ideil.bagistosdk.api.BasketApiService
import com.ideil.bagistosdk.api.BagistoRetrofitManager
import com.ideil.bagistosdk.entity.category.BagistoCategory
import com.ideil.bagistosdk.entity.response.BagistoGetProductsResponse
import com.ideil.bagistosdk.entity.response.BagistoGetCategoriesResponse
import retrofit2.Retrofit

/**
 * Class for calling basket api methods
 * */
class BagistoApi {

    /**
     * Get category by id
     *
     * @param categoryId - Category id
     * @return [Result] of category list
     * */
    suspend fun getCategory(categoryId: Long): Result<List<BagistoCategory>> {
        return kotlin.runCatching { apiService.getCategoryById(categoryId.toString()) }
    }

    /**
     * Get all categories
     *
     * @param limit - Category limit per page
     * @param page - Category list page
     * @param pagination Pagination param
     *
     * @return [Result] of categories
     * */
    suspend fun getCategories(limit: Int, page: Int, pagination: Int): Result<BagistoGetCategoriesResponse> {
        return kotlin.runCatching {
            apiService.getCategories(limit.toString(), page.toString(), pagination.toString())
        }
    }

    /**
     * Get products
     *
     * @param categoryId - Category id
     * @param limit - Product list limit per page
     * @param page - Product list page
     *
     * @return [Result] of prodcts list
     * */
    suspend fun getProducts(categoryId: Long, limit: Int, page: Int): Result<BagistoGetProductsResponse> {
        return kotlin.runCatching { apiService.getProducts(categoryId, limit, page) }
    }


    companion object {
        lateinit var retrofit: Retrofit
        lateinit var apiService: BasketApiService

        /**
         * Setup retrofit and services
         * */
        internal fun setupRetrofit() {
            retrofit = BagistoRetrofitManager.getRetrofit()
            apiService = retrofit.create(BasketApiService::class.java)
        }
    }

}