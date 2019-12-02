package 校内测试;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

/**
 * 问题描述
 * 　　任何一个正整数都可以用2进制表示，例如：137的2进制表示为10001001。
 * 　　将这种2进制表示写成2的次幂的和的形式，令次幂高的排在前面，可得到如下表达式：137=2^7+2^3+2^0
 * 　　现在约定幂次用括号来表示，即a^b表示为a（b）
 * 　　此时，137可表示为：2（7）+2（3）+2（0）
 * 　　进一步：7=2^2+2+2^0 （2^1用2表示）
 * 　　3=2+2^0
 * 　　所以最后137可表示为：2（2（2）+2+2（0））+2（2+2（0））+2（0）
 * 　　又如：1315=2^10+2^8+2^5+2+1
 * 　　所以1315最后可表示为：
 * 　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
 * 输入格式
 * 　　正整数（1<=n<=20000）
 * 输出格式
 * 　　符合约定的n的0，2表示（在表示中不能有空格）
 * 样例输入
 * 137
 * 样例输出
 * 2(2(2)+2+2(0))+2(2+2(0))+2(0)
 * 样例输入
 * 1315
 * 样例输出
 * 2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0)
 * 提示
 * 　　用递归实现会比较简单，可以一边递归一边输出
 */

public class T_2的次幂表示 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        String res = fun(num);
        System.out.println(res);
        sc.close();
    }


    private static String fun(Integer num) {
        if (num == 0 ) return "0";
        String num_str  = Integer.toBinaryString(num);
        StringBuffer strBuf = new StringBuffer();
        int index;
        boolean flag  = false;
        for (int i = 0 ;i <num_str.length();i++){

            if (num_str.charAt(i) == '1'){
                index = num_str.length()-i -1;
                if (flag) strBuf.append("+");
                if (index == 1) strBuf.append(2);
                else strBuf.append("2("  + fun(index) + ")");
                flag = true;
            }
        }
        return strBuf.toString();
    }
}
