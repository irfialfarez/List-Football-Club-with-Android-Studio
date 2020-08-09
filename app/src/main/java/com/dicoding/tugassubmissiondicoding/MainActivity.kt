package com.dicoding.tugassubmissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvKlub: RecyclerView
    private var list: ArrayList<Klub> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKlub = findViewById(R.id.rv_klub)
        rvKlub.setHasFixedSize(true)

        list.addAll(KlubData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvKlub.layoutManager = LinearLayoutManager(this)
        val listKlubAdapter = ListKlubAdapter(list)
        rvKlub.adapter = listKlubAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode (selectedMode: Int) {
        when (selectedMode) {
           R.id.action_about -> {
                val iProfile = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(iProfile)
            }
        }
    }


}
