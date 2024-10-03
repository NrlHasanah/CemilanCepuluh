package com.example.splashscreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private val getActivity: ScrollableList, private val foodList : List<food>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.FoodTitle.text = foodList[position].titlefood
        holder.FoodDesc.text = foodList[position].desc
        holder.FoodImage.setImageResource(foodList[position].image)

        holder.linearLayout.setOnClickListener {
            Toast.makeText(holder.itemView.context, foodList[position].titlefood, Toast.LENGTH_SHORT).show()
        }
    }



    override fun getItemCount(): Int {
        return foodList.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val FoodTitle : TextView = itemView.findViewById(R.id.recipeTitle)
        val FoodDesc : TextView = itemView.findViewById(R.id.recipeDescription)
        val linearLayout : LinearLayout = itemView.findViewById(R.id.linearlayout)
        val FoodImage : ImageView = itemView.findViewById(R.id.recipeImage)
        val Button : Button = itemView.findViewById(R.id.viewRecipeButton)
    }


}
