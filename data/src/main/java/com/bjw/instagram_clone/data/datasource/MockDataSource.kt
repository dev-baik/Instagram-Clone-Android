package com.bjw.instagram_clone.data.datasource

import com.bjw.instagram_clone.data.model.MockApiResponse

interface MockDataSource {
    suspend fun getKakaoMock(mString: String): MockApiResponse?
}
