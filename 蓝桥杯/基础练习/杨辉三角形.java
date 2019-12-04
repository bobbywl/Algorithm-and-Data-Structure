package 基础练习;


import java.util.Scanner;

/**
 * 问题描述
 * 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
 * 下面给出了杨辉三角形的前4行：
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 *1 4 6 4 1
 1 5 10 10 5 1

 * 1 1 2 3 6 10
 * 给出n，输出它的前n行。
 *
 * 输入格式
 * 输入包含一个数n。
 *
 * 输出格式
 * 输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
 * 样例输入
 * 4
 * 样例输出
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 数据规模与约定
 * 1 <= n <= 34。
 */

public class 杨辉三角形 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        int [] pre = new int[35];
        int [] next = new int[35];
        pre[0] = 0;
        pre[1] = 1;
        for (int i = 1 ; i <= n ; i++){

            for (int j = 1;j <= i;j++){
                next[j] = pre[j-1] + pre[j];
                System.out.print(next[j] + " ");
            }
            System.out.println();
            pre = next.clone();
            //TODO 数组赋值使用clone 直接使用pre = next 是无效的
        }
    }
}
