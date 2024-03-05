package com.bjw.instagram_clone.data.model

import com.google.gson.annotations.SerializedName

data class MockApiResponse(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("refreshToken")
    val refreshToken: String,
)
