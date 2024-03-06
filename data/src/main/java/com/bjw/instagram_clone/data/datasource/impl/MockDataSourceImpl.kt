package com.bjw.instagram_clone.data.datasource.impl

import com.bjw.instagram_clone.data.datasource.MockDataSource
import com.bjw.instagram_clone.data.model.MockApiResponse
import com.bjw.instagram_clone.data.remote.OAuthApi
import com.bjw.instagram_clone.data.utils.BaseRepository
import com.bjw.instagram_clone.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class MockDataSourceImpl @Inject constructor(
    private val oAuthApi: OAuthApi
) : BaseRepository(), MockDataSource {
    override suspend fun getKakaoMock(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiResponse? {
        return safeApiCall(remoteErrorEmitter) {
            oAuthApi.getMockApi("kakao", token).body()
        }
    }
}
