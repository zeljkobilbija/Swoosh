/*
 * Zeljko Bilbija Copyright (c) 2019.  All rights reserved
 */

package com.interfacemockup.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            var leagueIntent = Intent(this,LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }


    fun getStartedBtnPressed(view: View){
        var leagueIntent = Intent(this,LeagueActivity::class.java)
        startActivity(leagueIntent)
    }


}
