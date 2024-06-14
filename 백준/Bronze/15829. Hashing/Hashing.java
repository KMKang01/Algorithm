import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger big = new BigInteger("0");
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String [] sArr = s.split("");
        for(int i = 0; i < sArr.length; i++){
            int code = sArr[i].charAt(0) - (int)'a' + 1;
            big = big.add(BigInteger.valueOf(code).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(big);
    }
}