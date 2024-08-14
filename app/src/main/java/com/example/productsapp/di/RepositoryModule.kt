package com.example.productsapp.di

import com.example.productsapp.store.data.respository.ProductsRepositoryImpl
import com.example.productsapp.store.domain.respository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun provideProductsRepository(
        impl: ProductsRepositoryImpl
    ): ProductRepository
}