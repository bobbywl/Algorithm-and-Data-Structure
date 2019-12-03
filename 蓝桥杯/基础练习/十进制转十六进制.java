package 基础练习;

import java.util.Scanner;

/**
 * 问题描述
 * 　　十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。
 *    十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。
 * 　　给出一个非负整数，将它表示成十六进制的形式。
 * 输入格式
 * 　　输入包含一个非负整数a，表示要转换的数。0<=a<=2147483647
 * 输出格式
 * 　　输出这个整数的16进制表示
 * 样例输入
 * 30
 * 样例输出
 * 1E
 */

public class 十进制转十六进制 {
    public static char[] Alphabet = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        StringBuffer strBuf = new StringBuffer();
        do {
            strBuf.append(Alphabet[n % 16]);
            n /= 16;
        } while (n > 0);
        System.out.println(strBuf.reverse());
    }

}

//    /**
//     * 将二进制字符串转化成十六进制数
//     * @param string
//     */
//    private static void fun(String string) {
//        System.out.println(string);
//        int end = string.length(),star = end - 4;
//        while(star>0){
//            System.out.println(Alphabet[twotoTen(string.substring(star, end))]);
//            star-=4;
//            end-=4;
//        }
//        System.out.println(Alphabet[Integer.parseInt(string.substring(0, end))]);
//    }
//
//    /**
//     * 二进制转十进制
//     * @param substring
//     * @return
//     */
//    private static int twotoTen(String substring) {
//        System.out.println(substring);
//        int num = 0;
//        for (int i = 0; i<substring.length();i++){
//            num += (substring.indexOf(substring.length()-i-1)-'0')*Math.pow(2,i);
//        }
//        return num;
//    }
//}
