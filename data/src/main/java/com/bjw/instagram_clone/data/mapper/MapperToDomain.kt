package com.bjw.instagram_clone.data.mapper

import com.bjw.instagram_clone.data.model.MockApiResponse
import com.bjw.instagram_clone.domain.model.MockApiItem

object MapperToDomain {
    // data -> domain
    fun mapperToMockApiItem(response: MockApiResponse?): MockApiItem? {
        return response?.toItem()
    }

    private fun MockApiResponse.toItem(): MockApiItem {
        return MockApiItem(
            this.accessToken,
            this.refreshToken,
        )
    }
}
