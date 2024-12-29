import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N ; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);

            int hypo = Math.max(Math.max(a, b), c);

            if( a == hypo ){
                if(isRightTriangle(a, b, c)) sb.append("Scenario #").append(i).append(":\n").append("yes\n\n");
                else sb.append("Scenario #").append(i).append(":\n").append("no\n\n");
            } else if ( b == hypo ){
                if(isRightTriangle(b, a, c)) sb.append("Scenario #").append(i).append(":\n").append("yes\n\n");
                else sb.append("Scenario #").append(i).append(":\n").append("no\n\n");
            } else {
                if(isRightTriangle(c, a, b)) sb.append("Scenario #").append(i).append(":\n").append("yes\n\n");
                else sb.append("Scenario #").append(i).append(":\n").append("no\n\n");
            }
        }

        System.out.println(sb.toString().trim());
    }

    static boolean isRightTriangle(int hypo, int s1, int s2){
        if(hypo*hypo == s1*s1 + s2*s2) return true;
        else return false;
    }
}