package com.dicoding.tugassubmissiondicoding

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_klub.*

class ListKlubAdapter(val listKlub: ArrayList<Klub>) : RecyclerView.Adapter<ListKlubAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_baris_klub,viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,photo, detail, league) = listKlub[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvLeague.text = league

        val mContext =  holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, Detail_klub::class.java)
            moveDetail.putExtra(Detail_klub.EXTRA_NAME, name)
            moveDetail.putExtra(Detail_klub.EXTRA_PHOTO, photo)
            moveDetail.putExtra(Detail_klub.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }

    }

    override fun getItemCount(): Int {
        return listKlub.size

    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvLeague: TextView = itemView.findViewById(R.id.tv_league)
    }




}