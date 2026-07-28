import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.print(isLeapyear(y));
    }

    public static boolean isLeapyear(int y) {
        boolean flag = true;
        if(y % 4 == 0) {
            if(y % 100 == 0 && y % 400 != 0) {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;

    }
}