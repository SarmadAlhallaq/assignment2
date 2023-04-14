package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = fragment()
        val fragment1: Button = findViewById(R.id.fragment)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, firstFragment)
            commit()
        }
        fragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, firstFragment)
                commit()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.example_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> Toast.makeText(this, "you want burger", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "you want pizza", Toast.LENGTH_SHORT).show()
            R.id.subitem1 -> Toast.makeText(this, "you want pepsi", Toast.LENGTH_SHORT).show()
            R.id.subitem2 -> Toast.makeText(this, "you want water", Toast.LENGTH_SHORT).show()
        }
        return true;
    }

}

