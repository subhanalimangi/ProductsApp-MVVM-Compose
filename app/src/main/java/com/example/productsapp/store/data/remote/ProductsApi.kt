package com.example.productsapp.store.data.remote

import com.example.productsapp.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {
    @GET("products")
    suspend fun getProducts(): List<Product>
}