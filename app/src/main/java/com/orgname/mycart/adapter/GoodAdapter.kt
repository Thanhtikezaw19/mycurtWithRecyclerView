package com.orgname.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.orgname.mycart.R
import com.orgname.mycart.model.Goods
import kotlinx.android.synthetic.main.item_good.view.*

class GoodAdapter(var goodList: ArrayList<Goods>) : RecyclerView.Adapter<GoodAdapter.GoodViewHolder>(){

    class GoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(good: Goods) {
            itemView.txtName.text = good.name
            itemView.txtPrice.text = good.price.toString()
            itemView.imgGood.setImageResource(good.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoodViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_good, parent, false)

        return GoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: GoodViewHolder, position: Int) {

        holder.bind(goodList[position])

    }

    override fun getItemCount(): Int = goodList.size

}