import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int avg;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            String s = Integer.toString(tmp);
            String[] arr = s.split("");
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].equals("0")||arr[j].equals("6")) {
                    arr[j] = "9";
                }
                sb.append(arr[j]);
            }
            tmp = Integer.parseInt(sb.toString());

            if (tmp >= 100) tmp = 100;
            sum += tmp;
        }
        avg = (int) Math.round((double)sum/N);

        System.out.println(avg);
    }
}