import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int [] arr = Arrays.stream(binary.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        
        for(int i = arr.length - 1; i >= 0; i--)  {
            sum += arr[arr.length - i - 1] * (int) Math.pow(2, i);
            // System.out.println(arr[i] * (int) Math.pow(2, i));
        }
        System.out.print(sum);
    }
}