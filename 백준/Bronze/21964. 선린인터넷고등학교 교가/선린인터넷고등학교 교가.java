import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String [] arr = str.split("");
        for (int i = arr.length - 5; i < arr.length ; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}