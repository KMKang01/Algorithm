import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;
        String firstLine = sc.nextLine();
        String[] fArr = firstLine.split("");
        String secondLine = sc.nextLine();
        String[] sArr = secondLine.split("");
        for(int i = 0; i < N; i++) {
            if(!fArr[i].equals(sArr[i])) {count++;}
        }
        System.out.println(count);
    }
}