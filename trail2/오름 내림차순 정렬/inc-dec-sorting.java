import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        Integer [] arr = Arrays.stream(line).map(i -> Integer.parseInt(i)).toArray(Integer[]::new);
        Arrays.sort(arr);
        for(Integer a: arr) {
            System.out.print(a + " ");
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println();
        for(Integer a: arr) {
            System.out.print(a + " ");
        }
    }
}