import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            list.add(line);
        }
        for(int i = 0; i < M; i++){
            String line = sc.nextLine();
            if(list.contains(line)){
                count++;
            }
        }
        System.out.println(count);


    }
}