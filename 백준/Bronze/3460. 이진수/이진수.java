import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N ; i++) {
			int number = Integer.parseInt(br.readLine());
			while(true) {
				sb2.append(number % 2);
				number = (int)Math.floor((double)number /2);
				if(number == 0) break;
			}

			String a = sb2.toString();
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(j) == '1') sb1.append(j).append(' ');
			}
			
			sb2 = new StringBuilder();
		}
		System.out.print(sb1.toString().trim());

	}
}