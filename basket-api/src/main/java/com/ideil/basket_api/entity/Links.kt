package com.ideil.basket_api.entity


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Links(
    @SerializedName("first")
    val first: String?,
    @SerializedName("last")
    val last: String?,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String?
) : Parcelable