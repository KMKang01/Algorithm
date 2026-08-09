import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] line1 = br.readLine().split(" ");
        String [] line2 = br.readLine().split(" ");
        Arrays.sort(line1);
        Arrays.sort(line2);
        boolean flag = true;
        for(int i = 0; i < line1.length; i++) {
            if(!line1[i].equals(line2[i])) {
                flag = false;
                break;
            }
        }
        System.out.print(flag ? "Yes" : "No");
    }
}