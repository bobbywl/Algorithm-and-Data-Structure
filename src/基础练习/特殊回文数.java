package 基础练习;

import java.util.Scanner;

/**
 * 问题描述
 * 　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 * 输入格式
 * 　　输入一行，包含一个正整数n。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
 * 样例输入
 *  52
 * 样例输出
 *  899998
 *  989989
 *  998899
 * 数据规模和约定
 * 　　1<=n<=54。
 */
public class 特殊回文数 {
    /**
     * 解题基本观点：
     * 1. n为奇数的时候只有五位十进制数 ，n为偶数的时候有五位和六位十进制数
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        boolean isodd = false;
        if ((n & 0x1) != 1){
            isodd = true;
        }
        funFive(n,isodd);
        funSix(n,isodd);
        System.out.println();
        sc.close();

    }

    /**
     * 输出六位十进制数
     * @param n
     * @param isodd
     */
    private static void funSix(Integer n, boolean isodd) {
        if (!isodd) return;//奇数没有六位十进制数
        int halfSum = n/2;
        for (int i = 1 ; i<10 ;i++){
            for (int j = 0 ; j<10;j++){
                for(int k  = 0 ;k <10 ;k++){
                    if (i+j+k == halfSum){
                        System.out.println("" + i + j + k + k + j + i);
                    }
                }
            }
        }
    }

    /**
     * 输出五位十进制数
     * @param n
     * @param isodd
     */
    private static void funFive(Integer n, boolean isodd) {
        int midnum = 1,halfSum = 0;

        for (int i = 1 ;i<10;i++){
            for (int j = 0 ;j <10 ;j++){
                midnum = 1;
                if (isodd) midnum = 0;
                for (;midnum<10;midnum+=2){
                    halfSum = (n-midnum)/2;
                    if (i+j == halfSum){
                        System.out.println("" + i + j + midnum + j + i);
                    }
                }
            }
        }




    }

}
