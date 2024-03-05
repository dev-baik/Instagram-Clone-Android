package com.bjw.instagram_clone.data.remote

import com.bjw.instagram_clone.data.model.MockApiResponse
import retrofit2.Response
import retrofit2.http.POST

interface OAuthApi {
    @POST("auth/login")
    suspend fun getMockApi(): Response<MockApiResponse>
}
