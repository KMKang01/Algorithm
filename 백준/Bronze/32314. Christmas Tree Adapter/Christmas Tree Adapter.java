import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int w = Integer.parseInt(line[0]);
        int v = Integer.parseInt(line[1]);


        if(A <= w / v) System.out.printf("1");
        else System.out.printf("0");
    }
}