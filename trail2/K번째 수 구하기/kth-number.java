import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);

        String [] line2 = br.readLine().split(" ");
        int [] arr = Arrays.stream(line2).mapToInt(i -> Integer.parseInt(i)).toArray();
        Arrays.sort(arr);
        System.out.print(arr[k-1]);
    }
}