package com.example.kotlinlogginglogbackandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger.info { "Log some" }
    }
}
