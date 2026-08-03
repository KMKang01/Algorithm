import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String [] line1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);

        String [] line2 = sc.nextLine().split(" ");
        int [] arr = Arrays.stream(line2).mapToInt(i ->Integer.parseInt(i)).toArray();

        System.out.print(sum(m, arr));
    }

    public static int sum(int m, int [] arr) {
        int sum = 0;
        while(m != 0) {
            sum += arr[m - 1];
            if(m % 2 == 1) {
                m--;
            } else {
                m /= 2;
            }

            // System.out.println(sum);
        }

        return sum;
    }
}