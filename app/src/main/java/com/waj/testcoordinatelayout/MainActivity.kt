package com.waj.testcoordinatelayout

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar?.let { it.hide() }

        toolbar.title = "title"
        toolbar.setLogo(R.mipmap.ic_launcher)
        toolbar.subtitle = "child title"
        setSupportActionBar(toolbar)
    }
}
