import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		System.out.println(A * 1000 + B * 10000);
	}
}
