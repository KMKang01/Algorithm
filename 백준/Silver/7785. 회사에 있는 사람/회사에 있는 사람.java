import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String name;
        String action;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            name = line.split(" ")[0];
            action = line.split(" ")[1];
            map.put(name, action);
        }
        for ( Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue().equals("enter")) list.add(entry.getKey());
        }
        list.sort(Collections.reverseOrder());
        for(String s : list) { sb.append(s).append("\n"); }
        System.out.println(sb.toString().trim());
    }
}