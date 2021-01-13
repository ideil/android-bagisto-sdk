package com.ideil.basket_api.entity.product


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import com.ideil.basket_api.entity.Links
import com.ideil.basket_api.entity.Meta

/**
 * Data class for represent get products response
 * */
@Parcelize
data class GetProductsResponse(
    @SerializedName("data")
    val data: List<BasketProductApi>?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("meta")
    val meta: Meta?
) : Parcelable