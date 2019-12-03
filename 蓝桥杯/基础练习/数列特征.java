package 基础练习;

import java.util.Scanner;

public class 数列特征 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer len = sc.nextInt();
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,sum = 0,num = 0;
        for (int i = 0 ; i<len ;i++){
            num = sc.nextInt();
            if (num>max) max = num;
            if (num<min) min = num;
            sum += num;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println();
        sc.close();
    }
}
