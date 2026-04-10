package com.example.mye_comapp.data

data class Product(
    val productID: Int,
    val productName: String,
    val productPrice: Double,
    val productImage: Int,
    val productCategory: ProductCategory
)

data class ProductCategory(
    val categoryID: Int,
    val categoryName: String,
    val categoryImage: Int
)




