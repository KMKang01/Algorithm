import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String [] line = br.readLine().split("");
            for (int j = 0; j < line.length; j++) {
                if( i%2==0){
                    if(j%2==0&&line[j].equals("F")) count++;
                }else {
                    if(j%2==1&&line[j].equals("F")) count++;
                }
            }
        }

        System.out.println(count);

    }


}