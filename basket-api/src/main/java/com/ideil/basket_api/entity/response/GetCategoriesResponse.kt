package com.ideil.basket_api.entity.response


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import com.ideil.basket_api.entity.BasketCategoryApi
import com.ideil.basket_api.entity.Links
import com.ideil.basket_api.entity.Meta

@Parcelize
data class GetCategoriesResponse(
    @SerializedName("data")
    val data: List<BasketCategoryApi>?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("meta")
    val meta: Meta?
) : Parcelable