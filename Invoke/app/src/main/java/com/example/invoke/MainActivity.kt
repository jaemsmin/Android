package com.example.invoke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Test result
        Log.d("[DEBUG]",MyFunction.invoke("hello"))     // HELLO
        Log.d("[DEBUG]", MyFunction("hello"))           // HELLO
        Log.d("[DEBUG]", "$Sample Hello~!")            // [Sample의 주소값] Hello~!
        //Log.d("[DEBUG]", Sample("Hello~!") )                    // invoke 사용하지 않아 에러 발생
        Log.d("[DEBUG]",Sample.plus(" Hello~!"))        //  [Sample의 주소값] Hello~!

        Log.d("[DEBUG]", "$SampleTest Hello~!")         //  주소값 Hello~!
        Log.d("[DEBUG]",SampleTest.plus(" Hello~!"))     //  plus 실행

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

    object SampleTest {
        operator fun plus(str: String):String {
            return str.toUpperCase() // 모두 대문자로 바꿔줌
        }
    }
}
