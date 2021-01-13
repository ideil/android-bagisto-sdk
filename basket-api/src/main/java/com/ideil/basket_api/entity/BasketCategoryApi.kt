package com.ideil.basket_api.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BasketCategoryApi(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("code")
    val code: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("display_mode")
    val displayMode: String?,
    @SerializedName("description")
    val description: String?, // html
    @SerializedName("meta_title")
    val metaTitle: String?,
    @SerializedName("meta_description")
    val metaDescription: String?,
    @SerializedName("meta_keywords")
    val metaKeywords: String?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("additional")
    val additional: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("updated_at")
    val updatedAt: String?
) : Parcelable