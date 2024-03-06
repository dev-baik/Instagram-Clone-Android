package com.bjw.instagram_clone.domain.repository

import com.bjw.instagram_clone.domain.model.MockApiItem
import com.bjw.instagram_clone.domain.utils.RemoteErrorEmitter

interface MockRepository {
    suspend fun getKakaoMock(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiItem?
}
