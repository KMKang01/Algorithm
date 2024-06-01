import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] arr = new String[N];

        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            if (arr[i].trim().length() >= 6 && arr[i].trim().length() <= 9) {
                answer = answer + "yes\n";
            } else {
                answer = answer + "no\n";
            }
        }
        System.out.println(answer.trim());
    }
}