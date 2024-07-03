
import java.math.BigInteger;
import java.util.Scanner;
/*
*  시험장 개수: N
*  총감독관 - 한 시험장에 감독 가능 인원: B (1명만 있어야 함)
*  부감독관 - 한 시험장에 감독 가능 인원: C (여러명 있어도 됨)
*  각 시험장 응시자 수 A1, A2, ...
*  최소 감독관 수?
*   1 * B + ? * C = A1
*
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long countOfJudge = 0L; // 총합
        int N = sc.nextInt(); // 시험장 수 = 반복횟수
        int [] arr = new int[N]; // 시험장마다 응시 인원

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt(); // 총감
        int C = sc.nextInt(); // 부감

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            tmp -= B; // 총감 수만큼 뻄
            int count = 1; // 기본으로 1명은 차지함
            int subJudge = (int) Math.ceil((double) tmp/C); // 부감이 맡아야 하는 수 구함
            if(subJudge >= 0) { // 부감이 음수가 나온 경우 무시
                count += subJudge;
            }
            countOfJudge += count;
        }

        System.out.println(countOfJudge);
    }
}
//1 1 1 2 2 3 3 4 4 5
/*

10
1 2 3 4 5 6 7 8 9 10
3 2

* */