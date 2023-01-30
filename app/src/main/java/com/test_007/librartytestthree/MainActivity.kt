package com.test_007.librartytestthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.test_007.testlibrarythree.Sydney

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv).text = Sydney.suburbs[0]
    }
}