package com.dicoding.tugassubmissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvKlub: RecyclerView
    private var list: ArrayList<Klub> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Top 10 best club in the world"

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
        profile(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun profile(selectedMode: Int){
        if(selectedMode == R.id.action_about){
            movetoProfile()
        }
    }

    private fun movetoProfile(){
        val intent = Intent(this@MainActivity, ProfileActivity::class.java)
        startActivity(intent)
    }



}
