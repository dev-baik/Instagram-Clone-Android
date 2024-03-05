package com.bjw.instagram_clone.domain.repository

import com.bjw.instagram_clone.domain.model.MockApiItem

interface MockRepository {
    suspend fun getKakaoMock(token: String): MockApiItem?
}
