package io.dnatask.domain

import io.dnatask.data.Product
import io.dnatask.domain.models.BuyProductResult

interface ProductUseCases {

    suspend fun getProducts(): List<Product>
    suspend fun buy(productID: String): BuyProductResult
}