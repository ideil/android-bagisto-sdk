package com.ideil.bagistosdk.entity.product


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

/**
 * Data class for represent product from api
 * */
@Parcelize
data class BagistoProductApi(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("url_key")
    val urlKey: String?,
    @SerializedName("price")
    val price: String?,
    @SerializedName("formated_price")
    val formatedPrice: String?,
    @SerializedName("short_description")
    val shortDescription: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("images")
    val images: List<BagistoProductImage>?,
    @SerializedName("base_image")
    val baseImage: BagistoProductBaseImage?,
    @SerializedName("variants")
    val variants: List<String>?,
    @SerializedName("in_stock")
    val inStock: Boolean?,
    @SerializedName("reviews")
    val reviews: BagistoProductReviews?,
    @SerializedName("is_saved")
    val isSaved: Boolean?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("updated_at")
    val updatedAt: String?
) : Parcelable