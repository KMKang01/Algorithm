import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    대칭 차집합 = 두 집합의 합집합에서 교집합을 제외한 집합
* */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int A = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[0]);

        HashSet<String> union = new HashSet<>();
        HashSet<String> intersection = new HashSet<>();

        String elementOfA = br.readLine();
        StringTokenizer st1 = new StringTokenizer(elementOfA);
        while (st1.hasMoreTokens()) {
            union.add(st1.nextToken());
        }

        String elementOfB = br.readLine();
        StringTokenizer st2 = new StringTokenizer(elementOfB);
        while (st2.hasMoreTokens()) {
            String a = st2.nextToken();
            if (union.contains(a)) intersection.add(a);
            else union.add(a);
        }
        System.out.println(union.size() - intersection.size());

    }
}