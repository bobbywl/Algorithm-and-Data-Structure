package 基础练习;

public class T_01字串 {
    public static void main(String[] args) {
        for (int i = 0 ;i <= 31 ;i++){
            System.out.println(String.format("%5s",Integer.toBinaryString(i)).replace(' ','0'));
        }
    }
}
