import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (!line.equals("0 W 0")) {
            String[] arr = line.split(" ");

            int start = Integer.parseInt(arr[0]);
            int amount = Integer.parseInt(arr[2]);

            switch (arr[1]) {
                case "W":
                    if (start - amount < -200) {
                        sb.append("Not allowed\n");
                    } else {
                        sb.append(start - amount).append("\n");
                    }
                    break;
                case "D":
                    sb.append(start + amount).append("\n");
                    break;
            }
            line = br.readLine();
        }
        System.out.println(sb.toString().trim());

    }
}