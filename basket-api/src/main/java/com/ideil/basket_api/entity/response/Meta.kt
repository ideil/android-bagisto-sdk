package com.ideil.basket_api.entity.response


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Meta(
    @SerializedName("current_page")
    val currentPage: Int?,
    @SerializedName("from")
    val from: Int?,
    @SerializedName("last_page")
    val lastPage: Int?,
    @SerializedName("path")
    val path: String?,
    @SerializedName("per_page")
    val perPage: String?,
    @SerializedName("to")
    val to: Int?,
    @SerializedName("total")
    val total: Int?
) : Parcelable