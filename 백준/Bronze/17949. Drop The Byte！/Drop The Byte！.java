import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] hexInput = br.readLine().split("");
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int idx = 0;
		for (int i = 0; i < N; i++) {
			String type = input[i];
			long sum = 0;
			switch (type) {
				case "char":
					for (int j = 1; j >= 0; j--) {
						if (hexInput[idx].matches("[0-9]"))
							sum += (long) Math.pow(16, j) * Integer.parseInt(hexInput[idx]);
						else sum += (long) Math.pow(16, j) * ((int) hexInput[idx].charAt(0) - 'a' + 10);
						idx++;
					}
					break;
				case "int":
					for (int j = 7; j >= 0; j--) {
						if (hexInput[idx].matches("[0-9]"))
							sum += (long) Math.pow(16, j) * Integer.parseInt(hexInput[idx]);
						else sum += (long) Math.pow(16, j) * ((int) hexInput[idx].charAt(0) - 'a' + 10);
						idx++;
					}
					break;
				case "long_long":
					for (int j = 15; j >= 0; j--) {
						if (hexInput[idx].matches("[0-9]"))
							sum += (long) Math.pow(16, j) * Integer.parseInt(hexInput[idx]);
						else sum += (long) Math.pow(16, j) * ((int) hexInput[idx].charAt(0) - 'a' + 10);
						idx++;
					}
					break;
			}
			sb.append(sum).append(" ");
		}
		System.out.println(sb.toString().trim());

	}
}


