import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(countNums(a, b));
    }

    public static int countNums(int a, int b) {
        int count = 0;
        for(int i = a; i<= b; i++) {
            if(i % 2 == 0) {
                continue;
            } else if ( i % 10 == 5) {
                continue;
            } else if (i%3 == 0 && i % 9 !=0) {
                continue;
            } else {
                count++;
            }
            
        }
        return count;
    }
}