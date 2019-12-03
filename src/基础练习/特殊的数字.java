package 基础练习;

import java.util.Scanner;

/**
 * 问题描述
 * 　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行
 */

public class 特殊的数字 {
    public static void main(String[] args) {
        int [] data  = new int [10];
        for (int i = 0 ; i<10 ; i++){
            data[i] = i*i*i;
        }
        int [] num = new int [3];
        fun(data,num,0,1);
    }

    /**
     * 查找特殊数字
     * @param data 记录0-9的三次方的数组
     * @param num 拼凑的数字
     * @param index 指明当前拼凑数字位数
     * @param star 第一次从1开始（0不能做开头），其余位数从0开始
     */
    private static void fun(int[] data, int[] num, int index,int star) {
        if (index == num.length ){
            if ((num[0]*100+num[1]*10+num[2]) == (data[num[0]]+data[num[1]]+data[num[2]]))
                System.out.println(num[0]*100+num[1]*10+num[2]);
            return;
        }
        for (int i =star;i<data.length;i++){
            num[index] = i;
            fun(data,num,index+1,0);
        }
    }


}
