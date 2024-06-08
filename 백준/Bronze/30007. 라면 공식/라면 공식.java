import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for(int i = 0 ; i<n;i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int x = sc.nextInt();
            int w = a * (x -1 ) + b;
            sb.append(w+"\n");
        }
        System.out.println(sb.toString().trim());
    }
}