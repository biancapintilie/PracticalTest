package com.example.practicaltest01var06

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edit1 = findViewById<TextView>(R.id.editText1)
        val edit2 = findViewById<TextView>(R.id.editText2)
        val edit3 = findViewById<TextView>(R.id.editText3)
        val btn1 = findViewById<Button>(R.id.play_button)
        val btn2 = findViewById<Button>(R.id.points_button)
        val cb1 = findViewById<CheckBox>(R.id.checkBox1)
        val cb2 = findViewById<CheckBox>(R.id.checkBox2)
        val cb3 = findViewById<CheckBox>(R.id.checkBox3)

//        val buttonClickListener: ButtonClickListener = ButtonClickListener()

//        btn1.setOnClickListener {
//            var score = 0
//            if (cb1.isChecked) score = score + edit1.text.toString().toInt()
//            if (cb2.isChecked) score = score + edit2.text.toString().toInt()
//            if (cb3.isChecked) score = score + edit3.text.toString().toInt()
//            val rezultat = score.toString()
//            Log.d("MainActivity", "Rezultat Action1: $rezultat")
//        }

//        btn1.setOnClickListener {
//
//            val mResult = ("*, 1, 2, 3").random()
//
//            if (cb1.isChecked) edit1.text = mResult.toString()
//            if (cb2.isChecked) edit2.text = mResult.toString()
//            if (cb3.isChecked) edit3.text = mResult.toString()
//        }

    }
}