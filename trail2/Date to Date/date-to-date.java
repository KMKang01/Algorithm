import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //                            1   2   3   4   5   6   7   8   9   10  11  12
        int [] months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m1 = arr[0];
        int d1 = arr[1];
        int m2 = arr[2];
        int d2 = arr[3];

        int dayToD1 = d1, dayToD2 = d2;
        
        for(int i = 0; i < m1; i++) {
            dayToD1 += months[i];
        }
        for(int i = 0; i < m2; i++) {
            dayToD2 += months[i];
        }

        System.out.print(dayToD2 - dayToD1 + 1);
    }
}