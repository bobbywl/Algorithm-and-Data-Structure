package 入门训练;

import java.util.Scanner;

public class Fibonacci数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        long a = 1 ,b = 1 , res = 0;
        if (n<=2) {
            System.out.println(1);
            return;
        }

        for (long i = 2 ; i < n ;i++){
            res = (a+ b)%10007;
            a = b % 10007;
            b = res;
        }
        System.out.println((int)res);
    }
}
