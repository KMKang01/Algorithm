import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int X = Integer.parseInt(br.readLine());

		double loss = N * (double) (100 - X) * 0.01;
		double Y = N / loss * 100 - 100;
		System.out.printf("%.6f", Y);

	}
}