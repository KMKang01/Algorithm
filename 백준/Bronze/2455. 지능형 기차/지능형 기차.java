import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int people = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            String line = br.readLine();
            int out = Integer.parseInt(line.split(" ")[0]);
            int in = Integer.parseInt(line.split(" ")[1]);

            people = people - out + in;
            max = Math.max(max, people);
        }

        System.out.print(max);


    }
}