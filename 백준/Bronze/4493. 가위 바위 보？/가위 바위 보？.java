import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int T = Integer.parseInt(br.readLine());
			int p1 = 0;
			int p2 = 0;
			for (int j = 0; j < T; j++) {
				String[] input = br.readLine().split(" ");
				if(input[0].equals("R")) {
					if(input[1].equals("R")) {
						p1++; p2++;
					} else if (input[1].equals("S")) {
						p1++;
					} else {
						p2++;
					}
				} else if (input[0].equals("S")) {
					if(input[1].equals("R")) {
						p2++;
					} else if (input[1].equals("S")) {
						p1++; p2++;
					} else {
						p1++;
					}
				} else {
					if(input[1].equals("R")) {
						p1++;
					} else if (input[1].equals("S")) {
						p2++;
					} else {
						p1++; p2++;
					}
				}
			}
			if(p1==p2) sb.append("TIE").append("\n");
			else if (p1 > p2) sb.append("Player 1").append("\n");
			else sb.append("Player 2").append("\n");
		}


		System.out.println(sb.toString().trim());

	}
}