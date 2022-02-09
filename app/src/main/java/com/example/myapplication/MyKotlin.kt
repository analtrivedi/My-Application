@file:JvmName("AnalKotlin")
package com.example.myapplication

class MyKotlin {

    @JvmOverloads
    fun kotlinFun (fName: String, lName: String = "Trivedi"){
        println("L&T > "+fName + " "+lName)
    }

    companion object {
        @JvmStatic
        val MYTAG: String = "My static TAG"
    }
}