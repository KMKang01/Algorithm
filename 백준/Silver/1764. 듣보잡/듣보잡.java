import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int count = 0;
        int N = Integer.parseInt(line.split(" ")[0]);
        int M = Integer.parseInt(line.split(" ")[1]);

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> memberList = new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            map.put(br.readLine(), i);
        }

        for (int i = 0; i < M; i++) {
            String ln = br.readLine();
            if(map.containsKey(ln)){
                count++;
                memberList.add(ln);
            }
        }

        Collections.sort(memberList);

        sb.append(count).append("\n");
        for (String s: memberList) {
            sb.append(s+"\n");
        }

        System.out.println(sb.toString().trim());
    }
}