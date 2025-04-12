import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int count = 0;
        while(s.length() > 1) {
            int sum = 1;
            for(String a:s.split("")){
                sum *= Integer.parseInt(a);
            }
            s = Integer.toString(sum);
            count++;
        }
        System.out.println(count);

    }
}

