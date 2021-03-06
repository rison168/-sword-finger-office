package com.rison.office.chapter02;

/**
 * @author : Rison 2021/9/9 下午4:03
 * 题目描述：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每
 * 一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二
 * 维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 思路：从右上角或左下角开始找，逐行删除，或者用二分法查找
 */
public class Find {

    public boolean find(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int column = array[0].length - 1;
        while (row < array.length && column >= 0){
            if (array[row][column] == target){
                return true;
            }
            if (array[row][column] > target){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }

}
