import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String name = "";
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < N ; j++) {
				String line = br.readLine();
				int price = Integer.parseInt(line.split(" ")[0]);
				String player = line.split(" ")[1];
				if ( price >= max) {
					max = price;
					name = player;
				}
			}
			sb.append(name).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}

