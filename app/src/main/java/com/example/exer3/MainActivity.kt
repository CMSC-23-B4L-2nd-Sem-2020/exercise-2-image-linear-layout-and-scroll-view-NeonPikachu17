package com.example.exer3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("SENSELESS_COMPARISON")
class MainActivity : AppCompatActivity() {

    private lateinit var picView: ImageView
    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        // Creation of the app
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      val startRandom: Button = findViewById(R.id.roll_button)      // Dunno why this here when we don't use it for now
//      val retryRandom: Button = findViewById(R.id.retry)            // Dunno why this here when we don't use it for now

        // Setting onClickListeners for the buttons
        roll_button.setOnClickListener{ rollPics() }
        retry.setOnClickListener{ retryPic() }

        // Different initialized variables
        picView = findViewById(R.id.p5_image)
        textView = findViewById(R.id.story)

    }

    private fun rollPics() {
        // For randomization
        val randomInt = (1..10).random()
        // For data manipulation
        val picsView: ImageView = findViewById(R.id.p5_image)
        val storyView: TextView = findViewById(R.id.story)

        // Getting of the random int to set what resource to place
        val drawableResource = when (randomInt) {
            1 -> R.drawable.joker
            2 -> R.drawable.ann
            3 ->  R.drawable.futaba
            4 ->  R.drawable.goro
            5 ->  R.drawable.haru
            6 -> R.drawable.makoto
            7 -> R.drawable.morgana
            8 -> R.drawable.newgirl
            9 -> R.drawable.ryuji
            else -> R.drawable.yusuke
        }

        // To set the text
        when (randomInt) {
            1 -> storyView.setText(R.string.joker_text)
            2 -> storyView.setText(R.string.ann_text)
            3 -> storyView.setText(R.string.futaba_text)
            4 -> storyView.setText(R.string.goro_text)
            5 -> storyView.setText(R.string.haru_text)
            6 -> storyView.setText(R.string.makoto_text)
            7 -> storyView.setText(R.string.morgana_text)
            8 -> storyView.setText(R.string.newgirl_text)
            9 -> storyView.setText(R.string.ryuji_text)
            else -> storyView.setText(R.string.yusuke_text)
        }

        // Set image resource
        if(picsView !== null){
            picsView.setImageResource(drawableResource)
        }


    }


    private fun retryPic() {        // Function which restarts the program
        val picsView: ImageView = findViewById(R.id.p5_image)
        val textView: TextView = findViewById(R.id.story)

        picsView.setImageResource(R.drawable.p5logo)
        textView.setText(R.string.start_text)
    }
// Bernabe, Marveen Antonio S.
// CMSC 23 B-3L

}
