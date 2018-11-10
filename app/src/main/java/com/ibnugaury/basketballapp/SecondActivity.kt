package com.ibnugaury.basketballapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ibnugaury.basketballapp.Model.Model
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var genreOption = Model("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun mensClicked (view: View) {
        womensBtn.isChecked = false
        etcBtn.isChecked = false

        genreOption.genre = "Mens"
    }

    fun womensClicked (view: View) {
        mensBtn.isChecked = false
        etcBtn.isChecked = false

        genreOption.genre = "Women"
    }

    fun etcCLicked (view: View) {
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        genreOption.genre = "Etc"
    }

    fun nextClicked (view: View) {
        if (genreOption.genre != "") {
            val nextIntent = Intent (this, ThirdActivity::class.java)
            nextIntent.putExtra(EXTRA_PLAYER, genreOption)
            startActivity(nextIntent)
        }

        else {
            Toast.makeText(this, "Please fill the genre", Toast.LENGTH_SHORT).show()
        }
            }

}
