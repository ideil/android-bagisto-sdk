package com.ideil.basket_api.entity.product


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

/**
 * Data class for represent product image from api
 * */
@Parcelize
data class Image(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("path")
    val path: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("original_image_url")
    val originalImageUrl: String?,
    @SerializedName("small_image_url")
    val smallImageUrl: String?,
    @SerializedName("medium_image_url")
    val mediumImageUrl: String?,
    @SerializedName("large_image_url")
    val largeImageUrl: String?
) : Parcelable