package 入门训练;

import java.util.Scanner;

public class 序列求和 {
    /*注意点：1. 数据范围  2. 是否会超时*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((long)fun_2(sc.nextInt()));
        //TODO 这里子啊输出的时候要进行类型的转换
    }


    /**
     * 使用公式去计算  通过
     * @param n
     * @return
     */
    private static long  fun(int n) {
        return (long)(1+n)*n/2;
    }


    /**
     * 用递归计算 可能会超时  但是系统通过了
     * @param n
     * @return
     */
    private static long fun_2(int n) {
        if (n==1) return  1;
        return n + fun(n-1);
    }
}
