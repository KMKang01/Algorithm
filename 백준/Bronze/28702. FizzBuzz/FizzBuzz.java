import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int alpha = 0;
        String answer = "";
        for (int i = 3; i > 0; i--) {
            String line = sc.nextLine();
            switch (line) {
                case "Fizz":
                case "Buzz":
                case "FizzBuzz":
                    break;
                default:
                    num = Integer.parseInt(line);
                    alpha = i;
                    break;
            }
        }
        num += alpha;
        if (num % 3 == 0 && num % 5 == 0) {
            answer = "FizzBuzz";
        } else if (num % 3 == 0) {
            answer = "Fizz";
        } else if (num % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = Integer.toString(num);
        }
        System.out.println(answer);
    }
}

