import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int [] arr = new int [N];

        int count = 0;
        for (int i = 1; i <= N; i++) {
            arr[i -1] = i;

        }


        for (int i = 0; i < N; i++) {
            if(Integer.parseInt(input[i]) != arr[i]) count++;
        }

        System.out.println(count);
    }
}