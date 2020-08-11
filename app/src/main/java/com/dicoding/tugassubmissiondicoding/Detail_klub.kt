package com.dicoding.tugassubmissiondicoding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_klub.*
import org.w3c.dom.Text

class Detail_klub : AppCompatActivity() {


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_klub)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Club"

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetDet: TextView = findViewById(R.id.tv_set_details)



        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tIden = intent.getStringExtra(EXTRA_DETAIL)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDet.text = tIden


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

