import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i < P; i++) {
            String[] line = br.readLine().split("");
            int[] result = {0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < line.length - 2; j++) {
                result[whatCase(line[j] + line[j + 1] + line[j + 2])] += 1;
            }
            for (int a : result) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());

    }

    static public int whatCase(String s) {
        switch (s) {
            case "TTT":
                return 0;
            case "TTH":
                return 1;
            case "THT":
                return 2;
            case "THH":
                return 3;
            case "HTT":
                return 4;
            case "HTH":
                return 5;
            case "HHT":
                return 6;
            case "HHH":
                return 7;
        }
        return 0;
    }
}