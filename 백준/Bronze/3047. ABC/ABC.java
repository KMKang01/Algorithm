import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] line  = br.readLine().split(" ");
        String [] command = br.readLine().split("");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            arr.add(Integer.parseInt(line[i]));
        }
        int A = 0;
        int B = 0;
        int C = 0;

        Collections.sort(arr);

        A = arr.get(0);
        B = arr.get(1);
        C = arr.get(2);

        for (String c : command) {
            switch (c) {
                case "A":
                    System.out.printf("%d ", A);
                    break;
                case "B":
                    System.out.printf("%d ", B);
                    break;
                case "C":
                    System.out.printf("%d ", C);
                    break;
            }
        }
    }
}