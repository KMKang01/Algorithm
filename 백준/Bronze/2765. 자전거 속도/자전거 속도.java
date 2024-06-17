import java.util.*;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.1415927;
        final int MILE = 5280; // 1MILE = 5280 * FEET;
        final int FEET = 12; // 1FEET = 12 * INCH;
        final int HOUR = 60; // 1HOUR = 60 * MINUTE;
        final int MINUTE = 60; // 1MINUTE = 60 * 60;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
        while (!s.split(" ")[1].equals("0")) {
            String[] arr = s.split(" ");
            double diameter = Double.parseDouble(arr[0]); // 지름
            int rot = Integer.parseInt(arr[1]); // 회전수
            double time = Double.parseDouble(arr[2]); // 걸린 시간
            // 앞바퀴의 둘레 * 회전 수 = 이동거리
            // 평균 속도 = 이동거리 / 걸린 시간
            double distance = PI * diameter * rot / (MILE * FEET);
            double speed = distance / (time / (HOUR * MINUTE));
            sb.append("Trip #" + i + ": ").append(String.format("%.2f", distance) + " ").append(String.format("%.2f", speed)).append("\n");

            i++;
            s = sc.nextLine();
        }
        System.out.println(sb);
    }
}