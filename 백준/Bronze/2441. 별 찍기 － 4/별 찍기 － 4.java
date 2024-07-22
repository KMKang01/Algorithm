import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char star = '*';

        int T = Integer.parseInt(br.readLine());

        for (int i = T; i> 0 ; i--) {
            for (int j = 0; j < T - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0 ; k--) {
                System.out.print("*");
            }
            if(i >1){
                System.out.println();
            }
        }

    }
}