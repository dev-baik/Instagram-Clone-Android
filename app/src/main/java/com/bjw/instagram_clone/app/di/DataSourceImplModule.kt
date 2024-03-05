package com.bjw.instagram_clone.app.di

import com.bjw.instagram_clone.data.datasource.MockDataSource
import com.bjw.instagram_clone.data.datasource.impl.MockDataSourceImpl
import com.bjw.instagram_clone.data.remote.OAuthApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceImplModule {
    @Provides
    @Singleton
    fun provideMockDataSource(oauthApi: OAuthApi): MockDataSource {
        return MockDataSourceImpl(oauthApi)
    }
}
