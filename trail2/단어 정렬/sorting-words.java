import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i< n; i++) {
            list.add(br.readLine());
        }
        Collections.sort(list);
        for(String s: list) System.out.println(s);
    }
}