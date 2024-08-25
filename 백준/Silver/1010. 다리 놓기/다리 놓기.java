import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            sb.append(combination(a, b)).append("\n");
        }

        System.out.println(sb.toString().trim());
    }

    static long combination(int a, int b) {
        // 문제 조건에 따라 b >= a 이다.
        // 5, 13 => 13 C 5 -> 13! / (8! * 5!)
        /*
            13, 12, 11, 10, 9
            ------------------
            5,  4,  3,  2,  1
        */
        long result = 1;
        long tmp = 1;
        int[] numerator = new int[a];
        int[] denominator = new int[a];

        for (int i = 0; i < a; i++) {
            numerator[i] = b - i;
        } // 분자 배열

        for (int i = 0; i < a; i++) {
            denominator[i] = i + 1;
        } // 분모 배열

        for (int i = 0; i < a; i++) {
            result *= numerator[i];
            if(result % denominator[i] == 0){
                result /= denominator[i];
            } else {
                tmp *= denominator[i];
            }
        }

        if (tmp != 1) result /= tmp;

        return result;
    }
}