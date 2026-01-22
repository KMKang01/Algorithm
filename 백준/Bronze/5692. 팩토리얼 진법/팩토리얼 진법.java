import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String num;
		while(!(num = br.readLine()).equals("0")){
			int sum = 0;
			for (int i = 0; i < num.length(); i++) {
				int n = num.charAt(i) - '0';
				sum += n * factorial(num.length() - i);
			}
			sb.append(sum).append("\n");
		}

		System.out.print(sb);
	}

	public static int factorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}