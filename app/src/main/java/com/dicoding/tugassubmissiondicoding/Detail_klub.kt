package com.dicoding.tugassubmissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Detail_klub : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_klub)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Club"

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetDet: TextView = findViewById(R.id.tv_set_details)
        val tvCountry: TextView = findViewById(R.id.tv_set_country)


        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tIden = intent.getStringExtra(EXTRA_DETAIL)
        val tContr= intent.getStringExtra(EXTRA_COUNTRY)




        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDet.text = tIden
        tvCountry.text = tvCountry.toString()

    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_identity"
        const val EXTRA_COUNTRY = "extra_country"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }

