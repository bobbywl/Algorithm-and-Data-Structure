package 校内测试;

import java.util.Scanner;

public class 递归求二项式系数值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer k= sc.nextInt(),n=sc.nextInt();
        System.out.println((int) fun(k,n));
    }

    private static int fun(Integer k, Integer n) {
        if (k == 0 || k== n) return 1;
        return fun(k,n-1)+fun(k-1,n-1);
    }
}
