import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split(" ");



        for(String s : line){
            if(s.equals("social") || s.equals("history") || s.equals("language") || s.equals("literacy")){
                System.out.println("digital humanities");
                break;
            } else if( s.equals("bigdata") || s.equals("public") || s.equals("society")) {
                System.out.println("public bigdata");
                break;
            }
        }


    }
}