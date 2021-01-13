package com.ideil.basket_api

import com.ideil.basket_api.api.BasketApiService
import com.ideil.basket_api.api.BasketRetrofitManager
import com.ideil.basket_api.entity.category.BasketCategoryApi
import com.ideil.basket_api.entity.product.GetProductsResponse
import com.ideil.basket_api.entity.response.GetCategoriesResponse
import retrofit2.Retrofit

/**
 * Class for calling basket api methods
 * */
class BasketApi {

    /**
     * Get category by id
     *
     * @param categoryId - Category id
     * @return [Result] of category list
     * */
    suspend fun getCategory(categoryId: Long): Result<List<BasketCategoryApi>> {
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
    suspend fun getCategories(limit: Int, page: Int, pagination: Int): Result<GetCategoriesResponse> {
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
    suspend fun getProducts(categoryId: Long, limit: Int, page: Int): Result<GetProductsResponse> {
        return kotlin.runCatching { apiService.getProducts(categoryId, limit, page) }
    }


    companion object {
        lateinit var retrofit: Retrofit
        lateinit var apiService: BasketApiService

        /**
         * Setup retrofit and services
         * */
        internal fun setupRetrofit() {
            retrofit = BasketRetrofitManager.getRetrofit()
            apiService = retrofit.create(BasketApiService::class.java)
        }
    }

}