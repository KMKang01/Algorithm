
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());
        BigInteger answer = A.add(B);
        System.out.println(answer);
    }
}