package com.neppplus.kotlinbasic_20210829fred

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //본인의이름을 변수(myName)에 담고, 로그로 출력.

        val myName = "박광현" // 자료형 string 세팅.
        Log.d("이름출력-변수활용", myName)

        //한 사용자의 나이를 17살이라고 저장.
        val userAge = 14

        //이 사람이 성인인가요? 나이가 20살 이상인가?

        if (userAge >= 20) {
            Log.d("if문예시", "성인이 맞습니다")
        }
        else if (userAge >= 17) {
            //20살 미만 +17살 이상인 경우
            Log.d("if문예시", "고등학생입니다.")

        }

        else if ( userAge >= 14) {
            Log.d("if문예시", "중학생입니다.")

        }

        else {
            Log.d("if문 예시", 초등학생입니다.)
        }

        introduceToastBtn.setOnClickListener {

            Toast.makeText(this, "저는 박광현 입니다.", Toast.LENGTH_SHORT).show()


        }




        toastBtn.setOnClickListener {

            //토스트 - "반갑습니다." 문장 띄우기

            Toast.makeText(this, "반갑습니다.", Toast.LENGTH_SHORT).show()

        }


        logBtn.setOnClickListener {

            //이 중괄호 내부의 코드는, logBtn이 클릭될때마다 실행됨.

            Log.d("메인화면", "로그 버튼 눌림")

        }

        secondLogBtn.setOnClickListener {

            //두번째 버튼이 눌리면 할일을 따로 지정.

            Log.e("메인화면", "두번째 로그 버튼 눌림")

        }



    }
}