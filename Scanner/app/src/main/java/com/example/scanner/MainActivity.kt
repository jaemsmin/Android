package com.example.scanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var testArray:Array<String> = arrayOf("이름","2")
//        main(testArray)
    }

    fun main(args: Array<String>){
        val sc: Scanner = Scanner(System.`in`)      //system call error
        val name = sc.nextLine()
        val age = sc.nextLine()
        println("name: $name, age: $age")
    }

//    fun main(args: Array<String>) {
//        print("이름을 입력하세요 : ")
//        val name = readLine()
//        print("학교를 입력하세요 : ")
//        val s = Scanner(System.`in`)
//        val uni = s.nextLine() //입력
//        print("이름은 $name , 학교는 $uni 입니다.")
//    }
}
