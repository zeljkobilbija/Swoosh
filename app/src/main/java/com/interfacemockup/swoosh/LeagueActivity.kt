/*
 * Zeljko Bilbija Copyright (c) 2019.  All rights reserved
 */

package com.interfacemockup.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


        league_btn.setOnClickListener {
            var welcomeIntent = Intent(this, MainActivity::class.java)
            startActivity(welcomeIntent)
        }
    }

        fun manBtnPressed(view: View){
        var welcomeIntent  = Intent(this, MainActivity::class.java)
        startActivity(welcomeIntent)

    }


}
