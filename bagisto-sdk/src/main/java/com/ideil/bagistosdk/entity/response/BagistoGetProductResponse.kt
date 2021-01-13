package com.ideil.bagistosdk.entity.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.ideil.bagistosdk.entity.BagistoLinks
import com.ideil.bagistosdk.entity.BagistoMeta
import com.ideil.bagistosdk.entity.category.BagistoCategory
import com.ideil.bagistosdk.entity.product.BagistoProduct
import kotlinx.android.parcel.Parcelize


@Parcelize
data class BagistoGetProductResponse(
    @SerializedName("data")
    val data: BagistoProduct?,
    @SerializedName("links")
    val links: BagistoLinks?,
    @SerializedName("meta")
    val meta: BagistoMeta?
) : Parcelable