import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Coordinate [] arr = new Coordinate[T];

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            arr[i] = new Coordinate(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1]));
        }

        Arrays.sort(arr);
        for(Coordinate c : arr){
            sb.append(c.returnLine()).append("\n");
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

    public String returnLine(){
        return x + " " + y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if (this.x > o.x) {
             return 1;
        } else if ( this.x < o.x){
            return -1;
        } else {
            if (this.y > o.y) { return 1;}
            else { return -1;}
        }
    }
}