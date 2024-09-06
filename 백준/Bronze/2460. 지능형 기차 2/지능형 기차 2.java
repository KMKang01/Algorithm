import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int maxPeople = 0;
        int prev = 0;
        int now = 0;

        for (int i = 0; i < 10; i++) {
            String line = br.readLine();
            int out = Integer.parseInt(line.split(" ")[0]);
            int in = Integer.parseInt(line.split(" ")[1]);
            if(prev == 0){
                prev = in;
                now = in;
            } else {
                now -= out;
                now += in;
                maxPeople = Math.max(maxPeople, now);
            }
        }

        System.out.println(maxPeople);
    }
}