import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int X = sc.nextInt(); // 오른손
        int Y = sc.nextInt(); // 왼손

        int max = Math.max(X,Y);
        int min = Math.min(X,Y);
        int r;
        while(min != 0){
            r = max % min;
            max = min;
            min = r;
        }
        int gcd = max; // 양손
        int lcm = X * Y / gcd; // 끝

        int xCount = lcm / X;
        int yCount = lcm / Y;
        int bothCount = lcm / gcd;

        int intervalX = xCount;
        int intervalY = yCount;
        int intervalBoth = bothCount;


        for (int i = 0; i <= lcm; i++) {
            if( i == bothCount){
                sb.append(3);
                bothCount += intervalBoth;
                if(i == xCount) xCount += intervalX;
                if(i == yCount) yCount += intervalY;
            } else {
                if( i == xCount){
                    sb.append(1);
                    xCount += intervalX;
                } else if(i==yCount){
                    sb.append(2);
                    yCount += intervalY;
                }
            }
        }
        System.out.println(sb);


    }
}