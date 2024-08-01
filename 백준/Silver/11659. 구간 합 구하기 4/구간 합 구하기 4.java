import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] inputParams = input.split(" ");

        int N = Integer.parseInt(inputParams[0]);
        int M = Integer.parseInt(inputParams[1]);

        String nums = br.readLine();
        String[] numArr = nums.split(" ");

        int[] arr = new int[N];
        int[] sumArr = new int[N + 1];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numArr[i]);
            sumArr[i + 1] = sumArr[i] + arr[i];
        }

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            String[] indices = line.split(" ");
            int idx1 = Integer.parseInt(indices[0]);
            int idx2 = Integer.parseInt(indices[1]);

            int sum = sumArr[idx2] - sumArr[idx1 - 1];
            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}