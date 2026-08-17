import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];

        int hourGap = c - a;
        int minuteGap;
        // if ( b > d) {
            minuteGap = hourGap * 60 - b + d;
        // } else {
        //     minuteGap = hourGap * 60 + b - d;
        // }
        
        System.out.print(minuteGap);
    }
}