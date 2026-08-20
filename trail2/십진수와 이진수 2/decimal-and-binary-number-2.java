import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        StringBuilder sb = new StringBuilder();
        int [] arr = Arrays.stream(binary.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i] * Math.pow(2, arr.length - 1 - i);
        }
        sum *= 17;
        while(sum > 0) {
            sb.append(sum % 2);
            sum /= 2;
        }
        System.out.print(sb.reverse().toString());
    }
}