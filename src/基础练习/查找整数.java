package 基础练习;

import java.util.HashMap;
import java.util.Scanner;

public class 查找整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer len = sc.nextInt(),num;
        HashMap map = new HashMap();
        for (int i = 1 ;i <=len ;i++ ){
            num = sc.nextInt();
            if (!map.containsKey(num))
                map.put(num,i);
        }
        Integer fid = sc.nextInt();
        if (map.containsKey(fid))
            System.out.println(map.get(fid));
        else
            System.out.println(-1);
        System.out.println();
        sc.close();
    }
}
