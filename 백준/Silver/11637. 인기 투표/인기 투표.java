import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int who = 0;
			int max = 0;
			int people = 0;
			int sameScore = 1;
			int num = 0;
			for(int j = 0; j < n; j++) {
				num = Integer.parseInt(br.readLine());
				people += num;
				if(num > max) {
					max = num;
					who = j + 1;
					sameScore = 1;
				} else if (num == max) {
					sameScore++;
				}
			}
			
			if( sameScore == 1) {
				if(people / 2 < max) {
					sb.append("majority winner ").append(who).append("\n");
				} else {
					sb.append("minority winner ").append(who).append("\n");
				}
			} else {
				sb.append("no winner").append("\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
}


