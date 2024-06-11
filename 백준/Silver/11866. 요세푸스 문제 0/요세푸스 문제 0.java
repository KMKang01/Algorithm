import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder().append("<");
        int N = sc.nextInt();
        int K = sc.nextInt();
        int term = K - 1;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.addLast(i);
        }
        while (!list.isEmpty()) {
            if (list.get(term)!=null) {
                sb.append(list.get(term)).append(", ");
                list.remove(term);
                if (list.isEmpty()) {break;}
                term = (term + K - 1) % list.toArray().length;
            }
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}