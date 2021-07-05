package com.example.assignment13

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

    class NumbersRVAdapter (var numberList:List<BigInteger>): RecyclerView.Adapter<NumbersViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {   //Ctrl + i then highlight all and OK

            var itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.number_list_item, parent, false)
            return NumbersViewHolder(itemView)

        }
        override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
            holder.tvNumber.text = numberList.get(position).toString()
        }

        override fun getItemCount(): Int {

            return numberList.size
        }
    }

        class NumbersViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvNumber = itemView.findViewById<TextView>(R.id.tvNumbers)

    }