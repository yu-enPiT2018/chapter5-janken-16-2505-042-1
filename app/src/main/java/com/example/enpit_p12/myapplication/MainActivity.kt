package com.example.enpit_p12.myapplication

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id = intent.getIntExtra("MY_HAND", 0)

        gu.setOnClickListener { onJankenButtonTapped(it) }
        choki.setOnClickListener { onJankenButtonTapped(it) }
        pa.setOnClickListener { onJankenButtonTapped(it) }

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.clear().apply()

        when (id) {
            R.id.gu -> myHandImage.setImageResource(R.drawable.gu)
            R.id.choki -> myHandImage.setImageResource(R.drawable.choki)
            R.id.pa -> myHandImage.setImageResource(R.drawable.pa)

        }

    }



        fun onJankenButtonTapped(view: View?)  {


            val inent = Intent(this, ResultActivity::class.java)
            intent.putExtra("MY_HAND", view?.id)
            startActivity(intent)
        }

    }




//ｓｄｆｓｆｄｓｆｓｆｓ


//ｆっぐｋｖｖっびびｌｂ
