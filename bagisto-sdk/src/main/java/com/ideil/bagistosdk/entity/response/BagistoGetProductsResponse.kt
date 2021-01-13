package com.ideil.bagistosdk.entity.response


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import com.ideil.bagistosdk.entity.BagistoLinks
import com.ideil.bagistosdk.entity.BagistoMeta
import com.ideil.bagistosdk.entity.product.BagistoProduct

/**
 * Data class for represent get products response
 * */
@Parcelize
data class BagistoGetProductsResponse(
    @SerializedName("data")
    val data: List<BagistoProduct>?,
    @SerializedName("links")
    val links: BagistoLinks?,
    @SerializedName("meta")
    val meta: BagistoMeta?
) : Parcelable