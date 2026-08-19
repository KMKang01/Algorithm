import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int [] months = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayToD1 = d1, dayToD2 = d2;
        for(int i = 0; i < m1; i++) dayToD1 += months[i];
        for(int i = 0; i < m2; i++) dayToD2 += months[i];

        int dayGap = dayToD2 - dayToD1;
        int count = 0;
        int weekOfDay = 0;

        switch(A) {
            case "Mon": weekOfDay = 0; break;
            case "Tue": weekOfDay = 1; break;
            case "Wed": weekOfDay = 2; break;
            case "Thu": weekOfDay = 3; break;
            case "Fri": weekOfDay = 4; break;
            case "Sat": weekOfDay = 5; break;
            case "Sun": weekOfDay = 6; break;
        }

        for(int i = 0; i <= dayGap; i++) {
            if(i % 7 == weekOfDay) count++;
        }

        System.out.print(count);
    }
}