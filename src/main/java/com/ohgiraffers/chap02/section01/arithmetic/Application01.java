package com.ohgiraffers.chap02.section01.arithmetic;

public class Application01 {

    public static void main(String[] args) {

        int x = 700000;
        int y = 80000;

        Application01 app3 = new Application01();


        System.out.println(app3.plus(x,y));
        System.out.println(app3.minus(x,y));
        System.out.println(app3.multiply(x,y));
        System.out.println(app3.divide(x,y));

    }


    // x, y를 더하는 기능을 만들고 결과를 반환해주세요
    public int plus(int x , int y){
        int result01 = x + y;
        return result01;
    }

    // x,y를 빼는 기능을 만들고 결과를 반환해주세요
    public int minus(int x, int y){
        int result02 = x - y;
        return result02;
    }

    // x,y를 곱하는 기능을 만들고 결과를 반환해주세요
    public long multiply(int x, int y){
        long result03 = (long)x * y;
        return result03;
    }
    // x, y를 나누고 결과를 반환해주세요

    public double divide(int x, int y){
        double result04 = (double)x / y;
        return result04;
    }
}
