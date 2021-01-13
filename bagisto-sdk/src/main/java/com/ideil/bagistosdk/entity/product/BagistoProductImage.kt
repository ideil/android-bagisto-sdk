package com.ideil.bagistosdk.entity.product


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

/**
 * Data class for represent product image from api
 * */
@Parcelize
data class BagistoProductImage(
    @SerializedName("id")
    val id: Long?,
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