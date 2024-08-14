package com.example.productsapp.store.domain.respository

import arrow.core.Either
import com.example.productsapp.store.domain.model.NetworkError
import com.example.productsapp.store.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}