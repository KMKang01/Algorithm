import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(Math.abs(Integer.parseInt(s))).append(" ");
        }
        System.out.print(sb.toString());
    }
}