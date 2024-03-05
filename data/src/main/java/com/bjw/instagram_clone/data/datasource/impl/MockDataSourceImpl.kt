package com.bjw.instagram_clone.data.datasource.impl

import com.bjw.instagram_clone.data.datasource.MockDataSource
import com.bjw.instagram_clone.data.model.MockApiResponse
import com.bjw.instagram_clone.data.remote.OAuthApi
import javax.inject.Inject

class MockDataSourceImpl @Inject constructor(
    private val oAuthApi: OAuthApi
) : MockDataSource {
    override suspend fun getKakaoMock(token: String): MockApiResponse? {
        TODO("Not yet implemented")
    }
}