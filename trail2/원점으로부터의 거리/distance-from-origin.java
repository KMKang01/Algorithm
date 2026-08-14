import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Dot> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(new Dot(arr[0], arr[1], i+1));
        }
        list.sort(
            Comparator
            .comparingInt(Dot::getDistance)
            .thenComparingInt(Dot::getNum)
        );
        for(Dot d: list) System.out.println(d.num);
    }
}

class Dot {
    int x;
    int y;
    int num;

    public int getNum() {return num;}
    public int getDistance() {return Math.abs(x) + Math.abs(y);}

    Dot(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }
}