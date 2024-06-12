import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =1 ; i<=N ; i++){
            list.add(i);
        }
        while(list.size()!=1){
            list.removeFirst();
            list.addLast(list.poll());
        }
        System.out.println(list.getFirst());


    }
}