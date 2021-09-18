package com.rison.office.chapter13;

/**
 * @author : Rison 2021/9/18 上午11:52
 * 题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部
 * 分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 * 思路：每次只和前面一个数交换位置。或者利用辅助数组
 * 代码实现：
 */
public class MainTest {
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            if (array[i] % 2 != 0) {
                while (array[i] % 2 != 0) {
                    if (array[j] % 2 != 0) {
                        break;
                    }
                    if (array[j] % 2 == 0) {
                        int t = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = t;
                        j--;
                    }
                }
            }
        }
    }
}
