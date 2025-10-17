import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input = br.readLine().split(" ");
		int T1 = Integer.parseInt(input[0]);
		int T2 = Integer.parseInt(input[1]);

		System.out.println(Math.min(T1, T2));
	}
}
