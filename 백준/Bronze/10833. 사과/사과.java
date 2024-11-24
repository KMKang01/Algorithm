import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int apples = 0;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N ; i++) {
			String [] input = br.readLine().split(" ");
			apples += Integer.parseInt(input[1]) % Integer.parseInt(input[0]);
		}
		System.out.println(apples);

	}
}