import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(count(N));
    }

    public static int count(int n){
        if(n == 1) return 0;
        if(n % 2 == 0) return count(n/2) + 1;
        else return count(n/3) + 1;
    }   
}