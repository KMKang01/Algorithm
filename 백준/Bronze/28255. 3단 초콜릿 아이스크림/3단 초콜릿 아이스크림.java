import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            sb.append(s);
            int subStringLength = (int) Math.ceil((double) s.length() / 3);
            StringBuilder tmp = new StringBuilder();
            String sp = sb.substring(0, subStringLength); // S'
            tmp.append(sp);
            String tailSp = tmp.substring(1, tmp.length()); // tail(S')
            String revSp = tmp.reverse().toString(); // rev(S')
            tmp.delete(0, tmp.length());
            tmp.append(revSp);
            String tailRevSp = tmp.substring(1, tmp.length()); // tail(rev(S'))

            if (
                    s.equals(sp + revSp + sp) ||
                    s.equals(sp + tailRevSp + sp) ||
                    s.equals(sp + revSp + tailSp) ||
                    s.equals(sp + tailRevSp + tailSp)
            ) {
                answer.append("1\n");
            } else {
                answer.append("0\n");
            }
            sb.setLength(0); //sb 초기화
        }

        System.out.println(answer.toString().trim());
    }

}