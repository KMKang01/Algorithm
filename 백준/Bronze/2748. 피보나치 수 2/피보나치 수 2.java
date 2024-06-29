import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long fn_1 = 1L;
        long fn_2 = 0L;
        long fn = fn_1 + fn_2;

        if (N == 0) System.out.println(0);
        if (N == 1) System.out.println(1);
        if (N == 2) System.out.println(1);

        for (int i = 2; i < N; i++) {
            fn_2 = fn_1;
            fn_1 = fn;
            fn = fn_1 + fn_2;
        }

        if (N != 0 && N != 1 && N != 2) System.out.println(fn);
    }

}