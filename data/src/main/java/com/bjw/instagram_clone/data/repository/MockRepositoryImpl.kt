package com.bjw.instagram_clone.data.repository

import com.bjw.instagram_clone.data.datasource.MockDataSource
import com.bjw.instagram_clone.data.mapper.MapperToDomain
import com.bjw.instagram_clone.domain.model.MockApiItem
import com.bjw.instagram_clone.domain.repository.MockRepository
import com.bjw.instagram_clone.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class MockRepositoryImpl @Inject constructor(
    private val mockDataSource: MockDataSource
) : MockRepository {
    override suspend fun getKakaoMock(
        remoteErrorEmitter: RemoteErrorEmitter,
        token: String
    ): MockApiItem? {
        return MapperToDomain.mapperToMockApiItem(
            mockDataSource.getKakaoMock(remoteErrorEmitter, token = token)
        )
    }
}
