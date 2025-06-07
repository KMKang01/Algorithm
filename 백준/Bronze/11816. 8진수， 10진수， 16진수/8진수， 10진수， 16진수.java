import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();

		int sum = 0;
		if (num.contains("0x")) {
			String[] reversed = new StringBuilder()
					.append(num.substring(2))
					.reverse()
					.toString()
					.split("");
			for (int i = 0; i < reversed.length; i++) {
				if (reversed[i].charAt(0) >= '0' && reversed[i].charAt(0) <= '9') {
					sum += Integer.parseInt(reversed[i]) * (int) Math.pow(16, i);
				} else {
					sum += (reversed[i].charAt(0) - 'a' + 10) * (int) Math.pow(16, i);
				}
			}
		} else if (num.charAt(0) == '0') {
			String[] reversed = new StringBuilder()
					.append(num.substring(1))
					.reverse()
					.toString()
					.split("");
			for (int i = 0; i < reversed.length; i++) {
				sum += Integer.parseInt(reversed[i]) * (int) Math.pow(8, i);
			}
		} else {
			sum = Integer.parseInt(num);
		}
		System.out.println(sum);
	}
}


