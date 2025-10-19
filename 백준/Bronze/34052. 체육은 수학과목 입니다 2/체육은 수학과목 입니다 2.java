import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int third = Integer.parseInt(br.readLine());
		int fourth = Integer.parseInt(br.readLine());

		if(first + second + third + fourth <= 1500) System.out.println("Yes");
		else System.out.println("No");

	}
}
