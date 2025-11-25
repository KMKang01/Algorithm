import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int X = Integer.parseInt(line[0]);
		int Y = Integer.parseInt(line[1]);
		int N = Integer.parseInt(line[2]);

		for (int i = 1; i <= N; i++) {
			if (i % X == 0 && i % Y == 0) sb.append("FizzBuzz\n");
			else if (i % X == 0) sb.append("Fizz\n");
			else if (i % Y == 0) sb.append("Buzz\n");
			else sb.append(i).append("\n");
		}

		System.out.print(sb);
	}
}