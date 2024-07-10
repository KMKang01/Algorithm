import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] list = new int[10000];
        for (int i = 0; i < list.length; i++) {
            list[i] = i+1;
        }
        
        for (int i = 0; i < list.length; i++) {
            int num = d(i + 1);
            if (num <= 10000) list[num - 1] = 0;
        }

        for (int i : list) {
            if (i != 0) sb.append(i).append("\n");
        }

        System.out.println(sb.toString().trim());

    }

    public static int d(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
