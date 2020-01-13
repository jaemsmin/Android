package com.example.higher_order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }

// case 1
//    fun print(body: (String) -> String, body2: (String) -> String) {
//        println(body("이걸 더해서"))
//    }
//
//    fun test() {
//        print({ a ->
//            "$a 리턴되는 값을 정의"
//        }, {
//            "BBBB"
//        })
//    }

    fun print(body: (String, String) -> String) {
        println(body("이걸 더해서", "이것도 더해서"))
    }

    fun sample(a: String, b: String) = "$a $b 리턴되는 값을 정의"


    fun test() {
        print { a, b ->
            sample(a, b)
        }
    }

}
