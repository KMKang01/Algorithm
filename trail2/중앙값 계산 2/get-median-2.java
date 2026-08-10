import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer [] arr = Arrays.stream(br.readLine().split(" "))
                            .map(i -> Integer.parseInt(i)).toArray(Integer[]::new);
        
        for(int i = 0; i<n; i++) {
            if(i % 2 == 0) {
                Integer [] tmp =  new Integer[i+1];
                for(int j = 0; j < i+1; j++) {
                    tmp[j] = arr[j];
                }
                printMedian(tmp);
            }
        }
    }

    public static void printMedian(Integer [] arr) {
        Arrays.sort(arr);
        System.out.print(arr[arr.length / 2]+ " ");
    }
}