package com.ideil.bagistosdk.entity


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

/**
 * Data class for represent links info from api
 * */
@Parcelize
data class BagistoLinks(
    @SerializedName("first")
    val first: String?,
    @SerializedName("last")
    val last: String?,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String?
) : Parcelable