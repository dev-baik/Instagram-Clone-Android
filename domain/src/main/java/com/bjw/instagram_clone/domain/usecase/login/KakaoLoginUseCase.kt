package com.bjw.instagram_clone.domain.usecase.login

import com.bjw.instagram_clone.domain.model.MockApiItem
import com.bjw.instagram_clone.domain.repository.MockRepository
import com.bjw.instagram_clone.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class KakaoLoginUseCase @Inject constructor(
    private val mockRepository: MockRepository
) {
    suspend fun execute(remoteErrorEmitter: RemoteErrorEmitter, token: String): MockApiItem? {
        return mockRepository.getKakaoMock(remoteErrorEmitter, token = token)
    }
}
