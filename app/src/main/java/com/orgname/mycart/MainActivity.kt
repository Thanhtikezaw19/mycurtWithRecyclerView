package com.orgname.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.orgname.mycart.adapter.GoodAdapter
import com.orgname.mycart.model.Goods
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var goodList = ArrayList<Goods>()
        goodList.add(Goods("Fine Grain Sugar", 20.00,R.drawable.sugar))
        goodList.add(Goods("Peanuts", 20.00,R.drawable.peanut))
        goodList.add(Goods("Dawat Rice", 80.00,R.drawable.rice))

        var goodAdapter = GoodAdapter(goodList)
        goodsRecycler.layoutManager = LinearLayoutManager(this)
        goodsRecycler.adapter = goodAdapter
    }
}