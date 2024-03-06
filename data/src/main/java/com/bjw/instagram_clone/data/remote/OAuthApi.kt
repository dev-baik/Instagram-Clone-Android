package com.bjw.instagram_clone.data.remote

import com.bjw.instagram_clone.data.model.MockApiRequest
import com.bjw.instagram_clone.data.model.MockApiResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.POST

interface OAuthApi {
    @POST("auth/login")
    suspend fun getMockApi(
        @Body mockApiRequest: MockApiRequest
    ): Response<MockApiResponse>
}
