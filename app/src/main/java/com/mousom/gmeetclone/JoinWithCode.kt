package com.mousom.gmeetclone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class JoinWithCode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_with_code)
//        setSupportActionBar(findViewById(R.id.setting_toolbar))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val toolbar = findViewById<Toolbar>(R.id.setting_toolbar)
        toolbar.setNavigationOnClickListener(View.OnClickListener {
            super.onBackPressed();
        })



    }



}