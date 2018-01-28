package com.example.sophie.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openEnglQuiz(view: View) {
        val intent = Intent(this, English::class.java)
        startActivity(intent)

    }

    fun openPsyQuiz(view: View) {
        val intent = Intent(this, Psychology::class.java)
        startActivity(intent)

    }

    fun openGeKnQuiz(view: View) {
        val intent = Intent(this, GeneralKnowledge::class.java)
        startActivity(intent)

    }


    fun openAbSoQuiz(view: View) {
        val intent = Intent(this, AboutSophie::class.java)
        startActivity(intent)

    }
}

