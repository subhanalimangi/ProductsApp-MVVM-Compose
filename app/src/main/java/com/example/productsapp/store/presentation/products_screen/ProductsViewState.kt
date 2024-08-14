package com.example.productsapp.store.presentation.products_screen

import com.example.productsapp.store.domain.model.Product

data class ProductsViewState (
    val products: List<Product> = emptyList(),
    val loading: Boolean = false,
    val error: String? = null
)
