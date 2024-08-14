package com.example.productsapp.store.data.mapper

import android.os.Build
import androidx.annotation.RequiresExtension
import com.example.productsapp.store.domain.model.ApiError
import com.example.productsapp.store.domain.model.NetworkError
import retrofit2.HttpException
import java.io.IOException

fun Throwable.toGeneralError(): NetworkError {
    val error = when (this) {
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error = error,
        t = this
    )
}