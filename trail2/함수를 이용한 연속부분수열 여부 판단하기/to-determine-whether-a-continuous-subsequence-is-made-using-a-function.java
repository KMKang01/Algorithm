import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line1 = br.readLine().split(" ");
        int n1 = Integer.parseInt(line1[0]);
        int n2 = Integer.parseInt(line1[0]);

        String [] line2 = br.readLine().split(" ");
        int [] arrA = Arrays.stream(line2).mapToInt(i -> Integer.parseInt(i)).toArray();

        String [] line3 = br.readLine().split(" ");
        int [] arrB = Arrays.stream(line3).mapToInt(i -> Integer.parseInt(i)).toArray();
        
        System.out.print(checkContinousPartialArray(arrA, arrB));
    }

    public static String checkContinousPartialArray(int[] arrA, int[] arrB) {
        // arrA가 arrB보다 길거나 같아야 함
        boolean flag = false;
        if(arrA.length == arrB.length) {
            int count = 0;
            for(int i = 0; i < arrA.length; i++) {
                if(arrA[i] == arrB[i]) count++;
                else break;
            }
            if(count == arrB.length) flag = true;
        } else {
            for(int i = 0; i < arrA.length - arrB.length; i++) {
                int count = 0;
                for(int j = 0; j < arrB.length; j++) {
                    if(arrA[i + j] == arrB[j]) count++; // 각 배열의 위치에서 원소의 값이 같은 경우 count 증가
                    else break;
                }

                // System.out.println("i = " + i + ", count = " + count);        
                if(count == arrB.length) { // count가 arrB.length와 동일함 -> 연속부분배열임
                    flag = true;
                    break;
                }
            }
        }

        if(flag) return "Yes";
        else return "No";    
    }
}