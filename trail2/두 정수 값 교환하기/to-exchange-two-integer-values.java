import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        IntWrapper n = new IntWrapper(sc.nextInt());
        IntWrapper m = new IntWrapper(sc.nextInt());
        swap(n,m);
        System.out.print(n.value +  " " + m.value);
    }

    public static void swap(IntWrapper a, IntWrapper b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }
}

class IntWrapper {
    int value;
    public IntWrapper(int value) {
        this.value = value;
    }
}