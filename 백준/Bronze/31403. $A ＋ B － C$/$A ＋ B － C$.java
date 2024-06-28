import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        String strC = Integer.toString(C);
        int strResult = Integer.parseInt(strA + strB) - Integer.parseInt(strC);

        System.out.println(A + B - C);
        System.out.println(strResult);
    }
}