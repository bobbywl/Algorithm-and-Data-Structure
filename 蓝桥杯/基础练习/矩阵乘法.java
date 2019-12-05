package 基础练习;

import java.util.Scanner;

/**
 * 问题描述
 * 　　给定一个N阶方阵A，输出A的M次幂（M是非负整数）
 *  * 　　例如：
 * 　　A =
 * 　　1 2
 * 　　3 4
 * 　　A的2次幂
 * 　　7 10
 * 　　15 22
 * 输入格式
 * 　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
 * 　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
 * 输出格式
 * 　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
 * 样例输入
 * 2 2
 * 1 2
 * 3 4
 * 样例输出
 * 7 10
 * 15 22
 */
public class 矩阵乘法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer m = sc.nextInt();

        //矩阵构建
        int [][] data = new int[n][n];
        for (int row = 0 ;row<n;row++){
            for (int col = 0 ;col<n;col++) {
                data[row][col] = sc.nextInt();
            }
        }
        sc.close();

        //幂计算 使用快速幂等思想削减运算量
        int[][] res = new int[n][n];
        res = Matrix_mult(data,m);

        //结果输出
        for (int row = 0 ;row<n;row++){
            for (int col = 0 ;col<n;col++) {
                System.out.print(res[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int [][]  Matrix_mult(int[][] data, Integer m) {
        if( m == 0){
            //方阵的0次幂等于单位矩阵
            for (int row = 0 ;row<data.length;row++){
                for (int col = 0 ;col<data.length;col++) {
                    if (row == col) data[row][col] = 1;
                    else data[row][col] = 0;
                }
            }
            return data;
        }

        if (m == 1){
            return data.clone();
        }

        int[][] res = Matrix_mult(data,m>>1);
        res = fun(res,res);
        if ((m &0x1) != 0){
            res = fun(res,data);
        }
        return res;
    }



    /**
     * 求两个data的幂 结果保存在res中
     * @param data1
     * @param data2
     * @return
     */
    private static int[][] fun(int[][] data1,int[][] data2) {
        int len =data1.length;
        int [][] res  = new int[len][len];
        for (int i = 0 ; i < len ;i++ ){
            for(int j = 0 ;j<len ;j++){
                res[i][j] = mix(data1,data2,i,j);
            }
        }
        return res;
    }

    /**
     * 获得局矩阵中对应行和列对应位置乘积的和
     * @param data1
     * @param data2
     * @param row
     * @param col
     * @return
     */
    private static int mix(int[][] data1,int[][] data2, int row, int col) {
        int result = 0;
        for (int i = 0 ;i<data1.length;i++){
            result += data1[row][i] * data2[i][col];
        }
        return result;
    }
}
