package com.example.java_code.datas;

import java.io.Serializable;

public class User implements Serializable {

    private String nama;
    private int birthYear;


//    Alt + Insert => getter and setter 선택
//    같은 방식으로 생성자(constructor) 도 생성 가능

    public User(String nama, int birthYear) {
        this.nama = nama;
        this.birthYear = birthYear;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
