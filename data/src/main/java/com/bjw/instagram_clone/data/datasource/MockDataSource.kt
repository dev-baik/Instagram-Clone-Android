package com.bjw.instagram_clone.data.datasource

import com.bjw.instagram_clone.data.model.MockApiResponse
import com.bjw.instagram_clone.domain.utils.RemoteErrorEmitter

interface MockDataSource {
    suspend fun getKakaoMock(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiResponse?
}
