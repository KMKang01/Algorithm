import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String num = "";
        if (N < 10) {
            num = "0" + N;
        } else {
            num = Integer.toString(N);
        }
        int tmp = 0;
        int count = 0;
        do {
            String[] arr = num.split("");
            tmp = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]))%10;
            num = sb.append(arr[1]).append(tmp).toString();
            sb = new StringBuilder();
            count++;
        } while (Integer.parseInt(num) != N);
        System.out.println(count);
    }
}