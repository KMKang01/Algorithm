import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String [] line1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);

        String [] line2 = sc.nextLine().split(" ");
        int [] arrA = Arrays.stream(line2).mapToInt(i -> Integer.parseInt(i)).toArray();

        for(int i = 0; i < m; i++) {
            String [] lineN = sc.nextLine().split(" ");
            int a1 = Integer.parseInt(lineN[0]);
            int a2 = Integer.parseInt(lineN[1]);

            System.out.println(sumOfPartialArray(a1, a2, arrA));
        }
    }

    public static int sumOfPartialArray(int a1, int a2, int [] arr) {
        int sum = 0;
        for(int i = a1 -1; i < a2; i++) {
            sum += arr[i];
        }
        return sum;
    }
}