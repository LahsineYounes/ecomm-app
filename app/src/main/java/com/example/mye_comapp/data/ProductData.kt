package com.example.mye_comapp.data

import com.example.mye_comapp.R

object ProductData {

    val categories = listOf(
        ProductCategory(1, "Clothing", R.drawable.clothescategory),

        ProductCategory(2, "Electronics", R.drawable.electronicscategory),

        ProductCategory(3, "Food", R.drawable.foodcategory),

        ProductCategory(1, "Home", R.drawable.homecategory),

        ProductCategory(2, "Beauty", R.drawable.beautycategory),

        ProductCategory(3, "Accessories", R.drawable.accessoriescategory)
    )

    val products = listOf(
        Product(1, "SweatShirt", 199, R.drawable.cloth1, categories[0]),
        Product(2, "Jeans", 149, R.drawable.cloth2, categories[0]),
        Product(3, "Dress", 249, R.drawable.cloth3, categories[0]),
        Product(4, "Jacket", 299, R.drawable.cloth4, categories[0]),
        Product(5, "T-Shirt", 99, R.drawable.cloth5, categories[0]),
        Product(6, "Gown", 349, R.drawable.cloth6, categories[0]),

        Product(7, "Air Conditioner", 2499, R.drawable.elec1, categories[1]),
        Product(7, "Television", 2999, R.drawable.elec2, categories[1]),
        Product(9, "Laptop", 3999, R.drawable.elec3, categories[1]),
        Product(10, "Speakers", 599, R.drawable.elec4, categories[1]),
        Product(11, "Headphones", 249, R.drawable.elec5, categories[1]),
        Product(12, "Juicer", 499, R.drawable.elec6, categories[1]),

        Product(13, "Burger", 49, R.drawable.food1, categories[2]),
        Product(14, "Pizza", 69, R.drawable.food2, categories[2]),
        Product(15, "French Fries", 19, R.drawable.food3, categories[2]),
        Product(16, "Noodles", 39, R.drawable.food4, categories[2]),
        Product(17, "Cake", 99, R.drawable.food5, categories[2]),

        Product(18, "Bedsheet", 399, R.drawable.home1, categories[3]),
        Product(19, "Clock", 199, R.drawable.home2, categories[3]),
        Product(20, "Curtains", 299, R.drawable.home3, categories[3]),
        Product(21, "Table", 499, R.drawable.home4, categories[3]),

        Product(22, "lipstick", 129, R.drawable.beau1, categories[4]),
        Product(23, "Sunscreen", 99, R.drawable.beau2, categories[4]),
        Product(24, "Hair Brush", 69, R.drawable.beau3, categories[4]),
        Product(25, "Nail Polish", 59, R.drawable.beau4, categories[4]),
        Product(26, "Compact Powder", 149, R.drawable.beau5, categories[4]),

        Product(27, "Ring", 499, R.drawable.jewl1, categories[5]),
        Product(28, "Necklace", 649, R.drawable.jewl2, categories[5]),
        Product(29, "Bracelet", 599, R.drawable.jewl3, categories[5]),
        Product(30, "Earrings", 399, R.drawable.jewl4, categories[5]),
        Product(31, "Watch", 949, R.drawable.jewl5, categories[5]),
        Product(32, "Bangles", 349, R.drawable.jewl6, categories[5])

    )
}