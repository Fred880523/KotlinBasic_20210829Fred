package com.neppplus.kotlinbasic_20210829fred

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn.setOnClickListener {

            //이 중괄호 내부의 코드는, logBtn이 클릭될때마다 실행됨.

            Log.d("메인화면", "로그 버튼 눌림")

        }

    }
}