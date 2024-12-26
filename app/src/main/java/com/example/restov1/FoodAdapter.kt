package com.example.restov1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

data class FoodItem(
    val imageRes: Int,
    val price: String,
    val description: String
)

class FoodAdapter(private val items: List<FoodItem>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val foodImage: ImageView = view.findViewById(R.id.foodImage)
        private val foodPrice: TextView = view.findViewById(R.id.foodPrice)
        private val foodDescription: TextView = view.findViewById(R.id.foodDescription)
        private val addToCartButton: ImageView = view.findViewById(R.id.addToCartButton)

        fun bind(item: FoodItem) {
            foodImage.setImageResource(item.imageRes)
            foodPrice.text = item.price
            foodDescription.text = item.description
            addToCartButton.setOnClickListener {
                // Handle add to cart logic
                Toast.makeText(itemView.context, "Added to cart: ${item.description}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food_card, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
