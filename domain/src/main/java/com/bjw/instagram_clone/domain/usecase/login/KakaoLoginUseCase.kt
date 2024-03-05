package com.bjw.instagram_clone.domain.usecase.login

import com.bjw.instagram_clone.domain.model.MockApiItem
import com.bjw.instagram_clone.domain.repository.MockRepository
import javax.inject.Inject

class KakaoLoginUseCase @Inject constructor(
    private val mockRepository: MockRepository
) {
    suspend fun execute(token: String): MockApiItem? = mockRepository.getKakaoMock(token = token)
}
