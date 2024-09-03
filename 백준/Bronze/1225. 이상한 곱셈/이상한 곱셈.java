import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String a = input.split(" ")[0];
        String b = input.split(" ")[1];
        String [] aNums = a.split("");
        String [] bNums = b.split("");
        long result = 0;

        for (int i = 0; i < aNums.length; i++) {
            int num1 = Integer.parseInt(aNums[i]);
            for (int j = 0; j < bNums.length; j++) {
                int num2 = Integer.parseInt(bNums[j]);
                result += num1 * num2;
            }
        }
        System.out.println(result);
    }
}