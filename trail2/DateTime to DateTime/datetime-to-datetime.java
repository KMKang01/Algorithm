import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int a = input[0]; // 일
        int b = input[1]; // 사
        int c = input[2]; // 분

        int dayGap = a - 11;
        int hourGap = b - 11;
        int minuteGap = c - 11;

        boolean flag = true;
        if(dayGap == 0) {
            if(hourGap == 0) {
                if(minuteGap < 0) {
                    flag = false;
                }
            } else if(hourGap < 0) {
                flag = false;
            }
        }

        if(flag) {
            System.out.print(minuteGap + hourGap * 60 + dayGap * 24 * 60);
        } else {
            System.out.print(-1);
        }

    }
}