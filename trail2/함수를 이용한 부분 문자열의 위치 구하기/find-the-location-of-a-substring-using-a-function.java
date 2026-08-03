import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String n = sc.nextLine();

        int idx = whereIndex(m, n);
        System.out.print(idx);
    }

    public static int whereIndex(String m, String n) {
        int idx = -1;
        String [] mArr = m.split("");
        String [] nArr = n.split("");

        for(int i = 0; i < m.length() - n.length() + 1; i++) {
            int cnt = 0;
            for(int j = 0; j < n.length(); j++) {
                if(mArr[i + j].equals(nArr[j])) cnt++;
            }
            if(cnt == n.length()) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}