package com.bjw.instagram_clone.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bjw.instagram_clone.domain.model.MockApiItem
import com.bjw.instagram_clone.domain.usecase.login.KakaoLoginUseCase
import com.bjw.instagram_clone.domain.utils.ErrorType
import com.bjw.instagram_clone.domain.utils.RemoteErrorEmitter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val kakaoLoginUseCase: KakaoLoginUseCase,
) : ViewModel(), RemoteErrorEmitter {

    fun loginTest() {
        viewModelScope.launch {
            val response: MockApiItem? = kakaoLoginUseCase.execute(this@MainViewModel, "SUCCESSid")
            Log.d("MOCK TEST", response.toString())
        }
    }

    override fun onError(msg: String) {
        Log.e("MOCK TEST", msg)
    }

    override fun onError(errorType: ErrorType) {
        Log.d("MOCK TEST", errorType.name)
    }
}
