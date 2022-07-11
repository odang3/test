package com.example.test;

public class TestDto implements Test2 {

    private String name2;

    TestDto(){
        super();
    }
    TestDto(String name2){
        this();
        this.name2 = name2;
    }

}
