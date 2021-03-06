package com.ideil.bagistosdk.entity.product


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

/**
 * Data class for represent product reviews from api
 * */
@Parcelize
data class BagistoProductReviews(
    @SerializedName("total")
    val total: Int?,
    @SerializedName("total_rating")
    val totalRating: Int?,
    @SerializedName("average_rating")
    val averageRating: Int?,
    @SerializedName("percentage")
    val percentage: List<String>?
) : Parcelable