package com.ideil.bagistosdk.entity.response


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import com.ideil.bagistosdk.entity.category.BagistoCategory
import com.ideil.bagistosdk.entity.BagistoLinks
import com.ideil.bagistosdk.entity.BagistoMeta

@Parcelize
data class BagistoGetCategoriesResponse(
    @SerializedName("data")
    val data: List<BagistoCategory>?,
    @SerializedName("links")
    val links: BagistoLinks?,
    @SerializedName("meta")
    val meta: BagistoMeta?
) : Parcelable