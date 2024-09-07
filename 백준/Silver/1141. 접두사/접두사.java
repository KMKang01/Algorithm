import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();
        boolean [] arr = new boolean[N];
        for (int i = 0; i < N ; i++) {
            words.add(br.readLine());
        }
        words.sort(Comparator.comparingInt(String::length));

        boolean catched = false;
        for (int i = 0; i < words.size() ; i++) {
            String now = words.get(i);
            for (int j = i+1; j < words.size(); j++) {
                if(isPrefix(words.get(j), now)) {
                    catched = true; // 접두사임을 찾은 경우
                    break;
                }
            }
            if(catched){
                catched = false;
            } else {
                arr[i] = true;
            }
        }

        int count = 0;
        for(boolean a: arr){
            if(a) count++;
        }
        System.out.println(count);

    }

    public static boolean isPrefix(String a, String b) {
        int len = b.length();
        return a.substring(0, len).equals(b);
    }
}