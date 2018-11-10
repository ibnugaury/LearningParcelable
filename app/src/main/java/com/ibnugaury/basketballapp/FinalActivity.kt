package com.ibnugaury.basketballapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ibnugaury.basketballapp.Model.Model
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

       val player = intent.getParcelableExtra<Model>(EXTRA_PLAYER)

        textView4.text ="You are a ${player.genre} with ${player.skill} Just waiting for the moment"
    }


}
