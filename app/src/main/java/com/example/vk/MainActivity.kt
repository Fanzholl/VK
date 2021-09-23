package com.example.vk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        supportFragmentManager.beginTransaction().replace(R.id.startView, start_menu.newInstance()).commit()
    }

    fun click(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.startView, change_menu.newInstance()).commit()
    }

    fun clickback(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.startView, start_menu.newInstance()).commit()
    }

    fun click2(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.startView, celevoy_sbor.newInstance()).commit()
    }

    fun clickback2(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.startView, change_menu.newInstance()).commit()
    }
}