import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tokens = br.readLine().split(" ");
        int a = Integer.parseInt(tokens[0]);
        String o = tokens[1];
        int c = Integer.parseInt(tokens[2]);

        if(isOperator(o)) {
            System.out.printf("%d %s %d = %d", a, o, c, calculate(a, o, c));
        } else {
            System.out.print("False");
        }
    }

    public static boolean isOperator(String o) {
        if(o.equals("+") || o.equals("-") || o.equals("/") || o.equals("*")) return true;
        else return false;
    }

    public static int calculate(int a, String o, int c) {
        switch(o) {
            case "+": return a + c;
            case "-": return a - c;
            case "*": return a * c;
            case "/": return a / c;
            default: return 0;
        }
    }
}