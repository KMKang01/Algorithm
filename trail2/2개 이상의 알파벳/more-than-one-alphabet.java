import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(checkMoreThan2Chars(s) ? "Yes" : "No");
    }

    public static boolean checkMoreThan2Chars(String s) {
        String [] arr = s.split("");
        int [] alphas = new int[26];
        for(String c : arr) {
            alphas[c.charAt(0) - 'a']++;
        }

        int cnt = 0;
        for(int alpha : alphas) {
            if(alpha > 0) cnt++;
        }

        return cnt >= 2;
    }
}