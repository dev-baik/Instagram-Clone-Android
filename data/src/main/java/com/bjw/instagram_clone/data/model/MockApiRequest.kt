package com.bjw.instagram_clone.data.model

import com.google.gson.annotations.SerializedName

enum class MockType(val type: String) {
    KAKAO("KAKAO"),
    GOOGLE("GOOGLE"),
    NAVER("NAVER"),
}

data class MockApiRequest(
    @SerializedName("type")
    val type: MockType,
    @SerializedName("token")
    val token: String,
)
