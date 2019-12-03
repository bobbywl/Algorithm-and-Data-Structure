package 基础练习;

import java.util.Scanner;

public class 字符图形 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n =sc.nextInt(), m = sc.nextInt();
        String str = "ZYXWVUTSRQPONMLKJIHGFEDCBABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int star = str.length()/2,end = star + m;
        for(int i = 0 ; i < n ;i++){
            System.out.println(str.substring(star-i,end-i));
        }
        System.out.println();
        //TODO 最后一行记得换行输出  狗头.jpg
    }
}
