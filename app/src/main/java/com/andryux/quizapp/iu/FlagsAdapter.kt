package com.andryux.quizapp.iu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.andryux.quizapp.R
import com.andryux.quizapp.iu.FlagsAdapter.FlagsViewHolder

class FlagsAdapter : RecyclerView.Adapter<FlagsViewHolder>(){

    class FlagsViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun getItemCount(): Int {
        //
        return 1
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): FlagsViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return FlagsViewHolder(layout)
    }

    override fun onBindViewHolder(holder: FlagsViewHolder, position: Int) {
        //
    }
}