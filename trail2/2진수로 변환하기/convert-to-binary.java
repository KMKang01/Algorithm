import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n%2);
            n/=2;
        }
        if(sb.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(sb.reverse().toString());
        }
        
    }
}