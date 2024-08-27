import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("");

        long result = 0;
        for (int i = line.length - 1; i >= 0; i--) {
            String a = line[line.length - 1 - i];
            long n = (long) Math.pow((double) 16, (double) i);
            switch (a) {
                case "0":
                    break;
                case "1":
                    result += n;
                    break;
                case "2":
                    result += n * 2;
                    break;
                case "3":
                    result += n * 3;
                    break;
                case "4":
                    result += n * 4;
                    break;
                case "5":
                    result += n * 5;
                    break;
                case "6":
                    result += n * 6;
                    break;
                case "7":
                    result += n * 7;
                    break;
                case "8":
                    result += n * 8;
                    break;
                case "9":
                    result += n * 9;
                    break;
                case "A":
                    result += n * 10;
                    break;
                case "B":
                    result += n * 11;
                    break;
                case "C":
                    result += n * 12;
                    break;
                case "D":
                    result += n * 13;
                    break;
                case "E":
                    result += n * 14;
                    break;
                case "F":
                    result += n * 15;
                    break;
            }
        }
        System.out.println(result);
    }
}