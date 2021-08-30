package com.example.kotlin_1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("BasicSyntax","로그를 출력합니다. method = Log.d")

        var name = "홍길동"
        Log.d("BasicSyntax", "제 이름은 $name 입니다.") //$name은 코드로 인식된다.    }
}