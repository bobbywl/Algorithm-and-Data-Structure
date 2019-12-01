package 基础练习;

import java.util.Scanner;

public class 闰年判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer year = sc.nextInt();
        if (year % 4 == 0 && year %100 != 0 || year % 400 == 0){
            System.out.println("yes");
            return;
        }
        System.out.println("no");

    }
}
