import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(String ch : a.split("")) {
            char s = ch.charAt(0);
            if (s >='a' && s <= 'z') sb.append((char)(s + 'A' - 'a'));
            else if (s >= 'A' && ch.charAt(0) <='Z') sb.append((char)(s - 'A' + 'a'));
        }
        System.out.println(sb.toString());
    }
}