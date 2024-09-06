import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LocalDateTime ldc = LocalDateTime.now();
        System.out.println(ldc.getYear());
        System.out.println(ldc.getMonthValue());
        System.out.println(ldc.getDayOfMonth());
    }
}