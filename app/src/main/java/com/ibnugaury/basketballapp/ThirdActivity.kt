package com.ibnugaury.basketballapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ibnugaury.basketballapp.Model.Model
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    lateinit var player : Model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBeginnerCLick (view: View) {
        onProClick.isChecked = false
        player.skill = "Beginner"
    }

    fun onProClick (view: View) {
        onBeginnerClick.isChecked = false
        player.skill = "Pro"
    }

    fun onFinishClick (view: View) {

        if (player.skill != "") {
            val intentFinish = Intent(this, FinalActivity::class.java)
            intentFinish.putExtra(EXTRA_PLAYER, player)
            startActivity(intentFinish)

        }

        else {
            Toast.makeText(this, "Please fill the category", Toast.LENGTH_SHORT).show()
        }


    }
}
