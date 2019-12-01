package 入门训练;

import java.util.Scanner;

public class 圆的面积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer r = sc.nextInt();
        System.out.println(String.format("%.7f",r*r*Math.PI));
        //TODO 保留小数点后几位  这种方式是四舍五入的
    }
}
