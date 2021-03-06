package com.example.demo.ObjectLoderTest;

/**
 *  初始化顺序：父类成员变量->父类构造器->子类成员变量->子类构造器
 * Created by ChenMP on 2018/3/29.
 */
public class Base {
    private String baseName = "base";
    private String fromMethon;

    public Base() {
        callName();
    }

    public String fromMethonStr() {
        return "Base fromMethod";
    }

    public void callName() {
        System.out.println("baseName:" + baseName);
    }

    static class Sub extends Base{
        private String baseName = "sub";

        public Sub() {
            System.out.println("super.fromMethon:" + super.fromMethon);
        }

        @Override
        public void callName() {
            System.out.println("baseName:" + baseName);
        }

    }

    public static void main(String[] args) {
        Base base = new Sub();
    }
}
