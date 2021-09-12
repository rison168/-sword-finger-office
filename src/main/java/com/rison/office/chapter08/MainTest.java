package com.rison.office.chapter08;

/**
 * @author : Rison 2021/9/12 下午8:32
 * 题目描述：现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * 思路：递归的效率低，使用循环方式。
 */
public class MainTest {
    public long fibonacci(int n){
        long result = 0;
        long preOne = 1;
        long preTwo = 0;
        if (n == 0){
            return preTwo;
        }
        if (n == 1){
            return preOne;
        }
        for (int i = 2; i <= n; i++){
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }
}
