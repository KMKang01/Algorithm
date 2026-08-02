import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] A = str.split("");

        boolean flag = true;
        for(int i = 0; i < A.length / 2 - 1; i++) {
            if(!A[i].equals(A[A.length - i -1])) flag = false;
        }

        System.out.print(flag ? "Yes" : "No");
    }
}