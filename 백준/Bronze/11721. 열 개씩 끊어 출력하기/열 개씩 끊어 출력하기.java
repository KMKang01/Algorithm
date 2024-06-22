import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        int idx = 0;
        int fin = 0;
        while (str.length() > idx) {
            if(fin + 10 > str.length()) {
                fin = str.length();
            } else {
                fin += 10;
            }
            String tmp = str.substring(idx, fin);
            sb.append(tmp).append("\n");
            idx += 10;

        }
        System.out.println(sb.toString().trim());
    }
}