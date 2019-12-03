package 基础练习;


import java.util.*;

public class 数列排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer len = sc.nextInt();
        ArrayList list = new ArrayList();
        for (int i = 0 ; i<len ;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        //TODO 输出结果的时候  结尾的空格不受影响
    }
}
