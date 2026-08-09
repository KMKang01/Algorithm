import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String [] line = sc.nextLine().split("");
        Arrays.sort(line);
        for(String s: line) System.out.print(s);
    }
}