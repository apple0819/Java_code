package com.example.java_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.java_code.datas.User;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        1) 이벤트 설정
//        2) 초기 화면 값 세팅 .setText 등
//        + main 함수는 가능한한 적은 코드만 남기자.
//         => onCreate 메쏘드도 가능한 깔끔하게 정리.

        setupEvents();
        setValues();

    }


    @Override
    public void setupEvents() {


        User u = new User("조경진", 1988);

        Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
        intent.putExtra("userInfo", "u");
        startActivity(intent);
    }

    @Override
    public void setValues() {

    }


}
