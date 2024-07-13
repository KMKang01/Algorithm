import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Coordinate[] arr = new Coordinate[N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            int x = Integer.parseInt(line.split(" ")[0]);
            int y = Integer.parseInt(line.split(" ")[1]);
            arr[i] = new Coordinate(x, y);
        }

        Arrays.sort(arr);

        for (Coordinate s : arr) {
            sb.append(s.returnLocation()).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

}

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String returnLocation() {
        return x + " " + y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if(this.y == o.y) return this.x - o.x;
        else return this.y - o.y;
    }
}
