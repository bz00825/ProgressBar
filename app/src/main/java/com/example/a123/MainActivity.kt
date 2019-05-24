package com.example.a123

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

//class MainActivity : AppCompatActivity() {
//
//    private lateinit var textMessage: TextView
//    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.navigation_home -> {
//                textMessage.setText(R.string.title_home)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_dashboard -> {
//                textMessage.setText(R.string.title_dashboard)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_notifications -> {
//                textMessage.setText(R.string.title_notifications)
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val navView: BottomNavigationView = findViewById(R.id.nav_view)
//
//        textMessage = findViewById(R.id.message)
//        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
   // }

    class MainActivity : AppCompatActivity(), HomeFragment.OnFragmentInteractionListener {
        override fun onStartProgressBar() {
            Toast.makeText(this, "Start", Toast.LENGTH_LONG).show()
            pBar.visibility = View.VISIBLE
        }
        override fun onStopProgressBar() {
            Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show()
            pBar.visibility = View.GONE
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, HomeFragment())
                .commit()
            }

        }
   // }
