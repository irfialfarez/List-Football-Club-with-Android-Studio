package com.dicoding.tugassubmissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val actionbar = supportActionBar
        actionbar!!.title = "My Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val imgMe: ImageView = findViewById(R.id.img_profile)

        Glide.with(this)
            .load(img_profile)
            .apply(RequestOptions())
            .into(imgMe)
    }

}
