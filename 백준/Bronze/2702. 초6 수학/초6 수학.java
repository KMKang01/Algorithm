import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String [] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int gcd = getGCD(a, b);
			sb.append(a * b / gcd).append(" ").append(gcd).append("\n");
		}

		System.out.println(sb.toString().trim());
	}

	public static int getGCD(int a, int b) {
		int tmp = Integer.MIN_VALUE;
		if(a < b){
			while(tmp != 0){
				tmp = b % a;
				b = a;
				a = tmp;
			}
			return b;
		} else if (a == b) {
			return a;
		} else {
			while(tmp != 0){
				tmp = a % b;
				a = b;
				b = tmp;
			}
			return a;
		}
	}
}
