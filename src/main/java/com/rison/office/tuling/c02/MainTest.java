package com.rison.office.tuling.c02;

/**
 * @author : Rison 2021/9/22 上午11:27
 * 统计N以内的素数
 * 素数：只能被1和自身整除的数，0、1除外
 * 解法一：暴力算法
 * 直接从2开始遍历，判断是否能被2到自身之间的数整除
 */
public class MainTest {
    public int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans = isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    private boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}

