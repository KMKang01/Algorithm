import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String t = line1[2];

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.startsWith(t)) list.add(s);
        }
        Collections.sort(list);
        System.out.print(list.get(k-1));
    }
}