package 基础练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　求出区间[a,b]中所有整数的质因数分解。
 * 输入格式
 * 　　输入两个整数a，b。
 * 输出格式
 * 　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
 * 样例输入
 *     3 10
 * 样例输出
 *  3=3
 *  4=2*2
 *  5=5
 *  6=2*3
 *  7=7
 *  8=2*2*2
 *  9=3*3
 *  10=2*5
 * 提示
 * 　　先筛出所有素数，然再分后解。
 * 数据规模和约定
 * 　　2<=a<=b<=10000
 *     PS:1不是质数
 */
public class 分解质因数 {
    private static List<Integer> Alphabet = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer star = sc.nextInt();
        Integer end = sc.nextInt();
        sc.close();

        //根据数据范围约束 ， 求质数表
        for (int i =  2 ; i<10000 ;i++){
            if (isPrime(i)){
                Alphabet.add(i);
            }
        }

        for (int i =star ; i<=end ;i++){
            System.out.println(i + "=" + getFactorModifyVersion(i));
        }

    }

    /**
     * 求一个数的质数的分解
     * 先整个质数表 省的每次都判断质数 ->测试通过
     * @param n
     * @return
     */
    private static String getFactorModifyVersion(int n) {
        StringBuffer str = new StringBuffer();
        for (Integer num : Alphabet) {
            if (num>n) break;
            while(n%num == 0){
                str.append(num + "*");
                n/=num;
            }
        }
        return str.delete(str.length()-1,str.length()).toString();
    }




    /**
     * 求一个数的质数的分解
     * 数据量较大的时候会超时
     * @param n
     * @return
     */
    private static String getFactor(int n) {
        StringBuffer str = new StringBuffer();
        //在循环体中调整循环控制变量 操作要谨慎
        for (int i = 2;i<=n;i++){
            if (isPrime(i) && n%i==0){//是质数 且 是n因数
                while(n%i==0){
                    str.append(i + "*");
                    n/=i;
                }
                i = 1;
            }
        }
        return str.delete(str.length()-1,str.length()).toString();
    }


    /**
     * 判断一个数是否为质数
     * @param n
     * @return
     */
    private static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i = 2 ;i<n;i++){
            if (n%i==0) {
                return false;
            }
        }
        return  true;
    }
}
