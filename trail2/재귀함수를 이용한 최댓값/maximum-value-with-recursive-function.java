import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        int [] arr = Arrays.stream(line).mapToInt(i -> Integer.parseInt(i)).toArray();
        System.out.print(max(arr, 0, arr[0]));
    }

    public static int max(int [] arr, int i, int max) {
        // i를 증가시키면서 배열 순회
        // i의 초기값은 0, 마지막값은 arr.length - 1
        if(i == arr.length - 1) return max; // i가 arr.length - 1에 도달하면 max를 반환
        if(max < arr[i]) {
            return max(arr, i+1, arr[i]); // max가 현재값보다 작으면 max를 교체하고 다음 순번을 호출
        } else {
            return max(arr, i+1, max); // max가 현재값보다 크거나 같으면 max를 교체하지 않고 다음 순번을 호출
        }
    }
}