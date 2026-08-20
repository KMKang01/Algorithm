import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        int [] arr = Arrays.stream(N.split("")).mapToInt(Integer::parseInt).toArray();
        int decimal = 0;
        for(int i = 0; i < arr.length; i++) {
            decimal += arr[i] * (int) Math.pow(A, arr.length - i - 1);
        }
        StringBuilder sb = new StringBuilder();
        while(decimal > 0) {
            sb.append(decimal % B);
            decimal /= B;
        }

        System.out.print(sb.reverse().toString());
    }
}