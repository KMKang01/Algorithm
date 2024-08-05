import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(!list.contains(num)) {
                list.add(num);
            }
        }

        list.sort(Comparator.comparingInt(a -> a));

        for( int a : list) {
            sb.append(a).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}