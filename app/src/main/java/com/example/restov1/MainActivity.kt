package com.example.restov1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Set GridLayoutManager with 2 columns
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // Create food items
        val foodItems = listOf(
            FoodItem(R.drawable.burger_image, "$12.99", "Junk Food, French Fries, Cheeseburger"),
            FoodItem(R.drawable.images, "$18.99", "Huron Honey-Apple Chicken"),
            FoodItem(R.drawable.gyro_image, "$14.99", "Food, Central gyros the best gyros"),
            FoodItem(R.drawable.fries_image, "$9.99", "French Fries"),
            FoodItem(R.drawable.pizza_image, "$15.99", "Pepperoni Pizza with Extra Cheese"),
            FoodItem(R.drawable.sushi_image, "$22.99", "Fresh Sushi Platter"),
            FoodItem(R.drawable.salad_image, "$10.99", "Greek Salad with Feta Cheese"),
            FoodItem(R.drawable.steak_image, "$25.99", "Grilled Ribeye Steak"),
            FoodItem(R.drawable.taco_image, "$8.99", "Spicy Beef Tacos"),
            FoodItem(R.drawable.ice_cream_image, "$5.99", "Vanilla Ice Cream Sundae"),
            FoodItem(R.drawable.pasta_image, "$14.49", "Italian Spaghetti Carbonara"),
            FoodItem(R.drawable.chicken_wings_image, "$16.99", "Buffalo Chicken Wings"),
            FoodItem(R.drawable.burrito_image, "$12.49", "Beef Burrito with Guacamole"),
            FoodItem(R.drawable.donut_image, "$3.99", "Glazed Chocolate Donut")
        )


        // Set the adapter
        recyclerView.adapter = FoodAdapter(foodItems)
    }
}
