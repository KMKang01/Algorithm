import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] seven25 = br.readLine().split(" ");
		int X = Integer.parseInt(seven25[0]);
		int Y = Integer.parseInt(seven25[1]);
		double wonPerGram = (double) X / Y;

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String [] anotherConvenienceStore = br.readLine().split(" ");
			int x = Integer.parseInt(anotherConvenienceStore[0]);
			int y = Integer.parseInt(anotherConvenienceStore[1]);
			double anotherWonPerGram = (double) x / y;
			wonPerGram = Math.min(wonPerGram, anotherWonPerGram);
		}

		System.out.printf("%.2f%n", wonPerGram * 1000);
	}
}