package com.bjw.instagram_clone.app.di

import com.bjw.instagram_clone.data.datasource.impl.MockDataSourceImpl
import com.bjw.instagram_clone.data.repository.MockRepositoryImpl
import com.bjw.instagram_clone.domain.repository.MockRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideMockRepository(mockDataSourceImpl: MockDataSourceImpl): MockRepository {
        return MockRepositoryImpl(mockDataSourceImpl)
    }
}
