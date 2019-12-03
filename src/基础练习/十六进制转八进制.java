package 基础练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 *
 * 输入格式
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
 * 　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 *
 * 输出格式
 * 　　输出n行，每行为输入对应的八进制正整数。
 *
 * 　　【注意】
 * 　　输入的十六进制数不会有前导0，比如012A。
 * 　　输出的八进制数也不能有前导0。
 *
 * 样例输入
 * 　　2
 * 　　39
 * 　　123ABC
 *
 * 样例输出
 * 　　71
 * 　　4435274
 *
 * 　　【提示】
 * 　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 */

//TODO 官网检测数据有问题
public class 十六进制转八进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String str;
        List<String> list = new ArrayList<String>();
        while(n--!=0){
            str = sc.next();
            list.add(fun(str));
        }
        sc.close();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

    /**
     * 将十六进制转为八进制
     * @param str
     */
    private static String fun(String str) {
        return toEight(toTwo(str));
    }

    /**
     * 二进制转八进制
     * @param two
     * @return
     */
    private static String toEight(String two) {
        int end = two.length(),star = end -3;
        String str;
        StringBuffer strBuf = new StringBuffer();
        int num;
        boolean flag = false;
        do{

            str = two.substring(star,end);
            num = 0;
            for (int i = 0 ; i <str.length();i++){
                num = num * 2 + (str.charAt(i) - '0');
            }
            strBuf.append(num);
            end-=3;
            star-=3;
            if (flag) break;
            if (star <= 0) {
                star = 0;
                flag = true;
            }
        }while (star>=0);

        return strBuf.reverse().toString();
    }

    /**
     * 将是十六进制转换为二进制
     * @param str
     * @return
     */
    private static String toTwo(String str) {
        String Alphabet = "0123456789ABCDEF";
        StringBuffer strBuf = new StringBuffer();
        StringBuffer strTem = new StringBuffer();
        int n = 0;
        boolean flag =false;
        for (char c : str.toCharArray()){
            n = Alphabet.indexOf(c);
            do {
                strTem.append(n%2);
                n/=2;
            }while(n>0);
            while (strTem.length()<4 && flag) strTem.append("0");
            flag = true;
            strBuf.append(strTem.reverse());
            strTem .delete(0,strTem.length());
        }
        return strBuf.toString();
    }
}
