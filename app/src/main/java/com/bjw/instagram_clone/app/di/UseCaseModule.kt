package com.bjw.instagram_clone.app.di

import com.bjw.instagram_clone.domain.repository.MockRepository
import com.bjw.instagram_clone.domain.usecase.login.KakaoLoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideKakaoLoginUseCase(repository: MockRepository): KakaoLoginUseCase = KakaoLoginUseCase(repository)
}
