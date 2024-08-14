package com.example.productsapp.store.data.respository

import arrow.core.Either
import com.example.productsapp.store.data.mapper.toGeneralError
import com.example.productsapp.store.data.remote.ProductsApi
import com.example.productsapp.store.domain.model.NetworkError
import com.example.productsapp.store.domain.model.Product
import com.example.productsapp.store.domain.respository.ProductRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) :ProductRepository {
    override suspend fun getProducts() : Either<NetworkError, List<Product>> {
      return Either.catch {
        productsApi.getProducts()
      }.mapLeft { it.toGeneralError() }
    }
}