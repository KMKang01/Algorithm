/* 문제 이해

    - a층의 b호에 살려면 자신의 아래 (a-1)층의 1호부터 b호까지
    사람들의 수의 합만큼 사람들을 데려와 살아야 한다,
    - 아파트는 0층부터 있고, 각층은 1호부터 있으며, 0층의 i호에는 i명이 산다.

    [0층]
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
    [1층]
    1, 3, 6, 10, 15, ... , 105
    [2층]
    ...

    k,n <= 14

    a = 3, b = 4

    104호 = 004호 + 103호 = 004호 + 003호 + 102호 = 004호 + 003호 +

    304
    => 201 + 202 + 203 + 204
    => 101 * 4 + 102 * 3 + 103 * 2 + 104 * 1
    => 001 * 4 + (001 + 002) * 3 + (001 + 002 + 003) * 2 + (001 + 002 + 003 + 004 ) * 1

 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();

        int[][] matrix = new int[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (j == 0) {
                    matrix[i][j] = 1;
                    continue;
                }
                if (i == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }
            }
        } // 매트릭스 생성

//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 15; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        } 매트릭스 출력

        for(int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            sb.append(matrix[k][n-1] + "\n");
        }
        System.out.println(sb.toString().trim());
    }

}