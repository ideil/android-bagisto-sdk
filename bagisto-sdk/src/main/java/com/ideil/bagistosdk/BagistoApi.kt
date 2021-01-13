package com.ideil.bagistosdk

import com.ideil.bagistosdk.api.BagistoApiService
import com.ideil.bagistosdk.api.BagistoRetrofitManager
import com.ideil.bagistosdk.entity.category.BagistoCategory
import com.ideil.bagistosdk.entity.response.BagistoGetProductsResponse
import com.ideil.bagistosdk.entity.response.BagistoGetCategoriesResponse
import com.ideil.bagistosdk.entity.response.BagistoGetProductResponse
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
    suspend fun getCategory(categoryId: Long): List<BagistoCategory> {
        return apiService.getCategoryById(categoryId.toString())
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
    suspend fun getCategories(limit: Int, page: Int, pagination: Int): BagistoGetCategoriesResponse {
        return apiService.getCategories(limit.toString(), page.toString(), pagination.toString())
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
    suspend fun getProducts(categoryId: Long, limit: Int, page: Int): BagistoGetProductsResponse {
        return apiService.getProducts(categoryId, limit, page)
    }

    suspend fun getProduct(productId: Long): BagistoGetProductResponse {
        return apiService.getProduct(productId)
    }


    companion object {
        lateinit var retrofit: Retrofit
        lateinit var apiService: BagistoApiService

        /**
         * Setup retrofit and services
         * */
        internal fun setupRetrofit() {
            retrofit = BagistoRetrofitManager.getRetrofit()
            apiService = retrofit.create(BagistoApiService::class.java)
        }
    }

}