import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String L = sc.next();

        int x =(int)Math.ceil(Double.parseDouble(L)/5.0);
        System.out.println(x);
    }
}