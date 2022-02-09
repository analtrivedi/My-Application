package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ktClass = MyKotlin()
        ktClass.kotlinFun("Anal")

        val myJava = MyJava()
        myJava.call()

        println("L&T Call from Kotlin > "+MyKotlin.MYTAG)

    }

}