package com.ideil.basket_api.api

import com.ideil.basket_api.entity.BasketCategoryApi
import com.ideil.basket_api.entity.response.GetCategoriesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val URL_CATEGORIES = "api/categories"
private const val URL_CATEGORY_BY_ID = "api/categories/{id}"
private const val URL_CATEGORY_DESCENDANT = "api/descendant-categories"
private const val URL_PRODUCTS = "api/products"

/**
 * Base api service for retrofit queries
 * */
interface BasketApiService {

    /**
     * Get all categories
     * */
    @GET(URL_CATEGORIES)
    suspend fun getCategories(
        @Query("limit") limit: String,
        @Query("page") page: String,
        @Query("pagination") pagination: String
    ): GetCategoriesResponse

    /**
     * Get category by id
     * */
    @GET(URL_CATEGORY_BY_ID)
    suspend fun getCategoryById(@Path("id") id: String): List<BasketCategoryApi>

    /**
     * Get descendant categories
     * */
    @GET(URL_CATEGORY_DESCENDANT)
    suspend fun getCategoriesDescendant(@Query("parent_id") parentId: String): List<BasketCategoryApi>

    /**
     * Get products
     * */
    @GET(URL_PRODUCTS)
    suspend fun getProducts(
        @Query("category_id") categoryId: Long,
        @Query("limit") limit: Int,
        @Query("page") page: Int
    ): Any

}