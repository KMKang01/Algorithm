import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        int [] arr = Arrays.stream(line).mapToInt(i -> Integer.parseInt(i)).toArray();

        
        System.out.print(getLcmRec(arr, 0));
    }

    public static int gcd(int a, int b) {
        while(b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int getLcmRec(int[] arr, int index) {
        // 배열의 마지막 원소에 도달하면 해당 값 반환
        if (index == arr.length - 1) {
            return arr[index];
        }
        // [현재 원소]와 [나머지 원소들의 LCM]의 LCM을 구함
        return lcm(arr[index], getLcmRec(arr, index + 1));
    }
}