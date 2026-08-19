import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        //                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12};
        int [] months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] week = new String [] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int dayToD1 = 0, dayToD2 = 0;
        for(int i = 0; i < m1; i++) dayToD1 += months[i];
        dayToD1 += d1;

        for(int i = 0; i < m2; i++) dayToD2 += months[i];
        dayToD2 += d2;

        int dayGap = dayToD2 - dayToD1;
        if(dayGap > 0) {
            System.out.print(week[dayGap % 7]);
        } else {
            int j = 7 + dayGap % 7;
            if(j == 7) j = 0;
            System.out.print(week[j]);
        }
    }
}