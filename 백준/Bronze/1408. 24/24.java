import java.io.*;
import java.time.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalTime t1 = LocalTime.parse(br.readLine());
        LocalTime t2 = LocalTime.parse(br.readLine());

        int diff = t2.toSecondOfDay() - t1.toSecondOfDay();
        if (diff <= 0) diff += 24 * 60 * 60; 

        int h = diff / 3600;
        int m = (diff % 3600) / 60;
        int s = diff % 60;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
