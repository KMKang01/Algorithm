import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        int [] answer = new int [arr.length];
        for(int i = 0; i < arr.length; i++) {
            int num =  Integer.parseInt(arr[i]);
            answer[i] = num % 2 == 0 ? num / 2 : num;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int num : answer) {
            sb.append(num).append(" ");
        }

        System.out.print(sb.toString());
    }
}