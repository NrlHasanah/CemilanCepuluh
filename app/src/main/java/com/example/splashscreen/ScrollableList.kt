package com.example.splashscreen

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity

class ScrollableList : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var myAdapter: MyAdapter? = null
    private var foodList: MutableList<food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrollable_list)

        recyclerView = findViewById<RecyclerView>(R.id.listhead)
        myAdapter = MyAdapter(this, foodList)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = myAdapter

        prepareFoodListData()
    }

    private fun prepareFoodListData() {
        var food = food("Pure Wortel dan Kentang", "Kaya akan vitamin A dan karbohidrat untuk energi dan kesehatan mata anak", R.drawable.carrot)
        foodList.add(food)
        food = food("Mini Pancake dan Yogurt", "Pancake lembut dengan tambahan yogurt, kaya protein dan kalsium untuk pertumbuhan tulang anak", R.drawable.pancake)
        foodList.add(food)
        food = food("Bubur Gandum dan Susu Almond", "Makanan pendamping ASI yang mengandung serat tinggi dan lemak sehat", R.drawable.bubur)
        foodList.add(food)
        food = food("Popsicle Mangga", "Popsicle sehat dengan campuran buah mangga segar dan yogurt, sempurna untuk camilan menyegarkan", R.drawable.popsicle)
        foodList.add(food)

        myAdapter!!.notifyDataSetChanged()
    }
}
