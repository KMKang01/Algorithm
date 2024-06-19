
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();
        String[] docArr = doc.split("");

        int cnt = 0;
        int idx = 0;
        while (idx < docArr.length) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < word.length(); i++) {
                if(idx+i >= docArr.length) break;
                sb.append(docArr[idx+i]);
            }
            if(sb.toString().equals(word)) {
                cnt++;
                idx = idx + word.length();
            } else {
                idx++;
            }
        }
        System.out.println(cnt);
    }
}
