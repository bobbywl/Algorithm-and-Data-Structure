package 校内测试;

import java.util.Scanner;

/**
 * 问题描述
 * 　　每年冬天，北大未名湖上都是滑冰的好地方。北大体育组准备了许多冰鞋，可是人太多了，每天下午收工后，常常一双冰鞋都不剩。
 * 　　每天早上，租鞋窗口都会排起长龙，假设有还鞋的m个，有需要租鞋的n个。现在的问题是，这些人有多少种排法，可以避免出现体育组没有冰鞋可租的尴尬场面。（两个同样需求的人（比如都是租鞋或都是还鞋）交换位置是同一种排法）
 * 输入格式
 * 　　两个整数，表示m和n
 * 输出格式
 * 　　一个整数，表示队伍的排法的方案数。
 * 样例输入
 * 3 2
 * 样例输出
 * 5
 */

public class 未名湖边的烦恼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer m = sc.nextInt(), n = sc.nextInt();
        int res = fun(m,n,0,m+n);
        System.out.println(res);
    }

    /**
     * 求排队的情况
     * @param m 还鞋的人数
     * @param n 接鞋的人数
     * @param left 剩余鞋量
     * @param len 队伍长度
     * @return
     */
    private static int fun(Integer m, Integer n, int left, int len) {
        if (left<0 || m<0 || n <0) return 0;
        if (len == 0 ) return 1;
        return fun(m-1,n,left+1,len-1)+
        fun(m,n-1,left-1,len-1);
    }

}
