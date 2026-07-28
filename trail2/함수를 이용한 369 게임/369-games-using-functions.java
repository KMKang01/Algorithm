import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(countNums(a,b));
    }

    public static int countNums(int a, int b) {
        int count = 0;

        for(int i = a; i <= b; i++) {
            if(i % 3 == 0) count++;
            else { // 3, 6, 9가 포함된 수 찾기
                String numStr = Integer.toString(i);
                boolean flag = numStr.contains("3") || numStr.contains("6") || numStr.contains("9");
                // System.out.println(i+" " +flag);
                if(flag) count++;
            }
        }
        return count;
    }
}