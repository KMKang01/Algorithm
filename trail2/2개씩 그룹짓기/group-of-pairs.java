import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        Integer [] arr = Arrays.stream(line).map(i -> Integer.parseInt(i)).toArray(Integer[]::new);
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < arr.length / 2 ; i++) {
            max = Math.max(max, arr[i] + arr[arr.length - i - 1]);
        }
        System.out.print(max);
        // 1 2 3 5 7 8
        // 8 9 9

    }
}