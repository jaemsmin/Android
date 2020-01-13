package com.example.invoke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("[DEBUG]",MyFunction.invoke("hello"))     // HELLO
        Log.d("[DEBUG]", MyFunction("hello"))           // HELLO
        Log.d("[DEBUG]",Sample + " Hello~!")           // [Sample의 주소값] Hello~!

        /*
        MyFunction.invoke("hello") // HELLO
        MyFunction("hello") // HELLO
        Sample + " Hello~!" // [Sample의 주소값] Hello~!
        */
    }

    object MyFunction {
        operator fun invoke(str: String): String {
            return str.toUpperCase() // 모두 대문자로 바꿔줌
        }
    }

    object Sample {
        operator fun plus(str: String):String {
            return this.toString() + str
        }
    }
}
