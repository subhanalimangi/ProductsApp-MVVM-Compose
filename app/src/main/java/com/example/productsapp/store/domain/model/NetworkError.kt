package com.example.productsapp.store.domain.model

data class NetworkError(
    val error: String,
    val t : Throwable? = null,
)
enum class ApiError (val message: String){
    NetworkError("Network Error"),
    UnknownResponse("Unknown Response"),
    UnknownError("Unknown Error")
}