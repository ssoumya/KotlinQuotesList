package com.cilla3bc.quoteslist

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val title = findViewById<View>(R.id.titleTv) as TextView

        val myTypeface = Typeface.createFromAsset(
                this.assets,
                "BLKCHCRY.TTF")

        title.typeface = myTypeface

        val splashThread = object : Thread() {

            override fun run() {
                try {
                    Thread.sleep(2000)
                    val intent = Intent(baseContext, QuotesListActivity::class.java)
                    startActivity(intent)
                    finish()

                } catch (e: Exception) {

                }

            }
        }
        splashThread.start()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}


