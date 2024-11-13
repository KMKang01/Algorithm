import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int D = Integer.parseInt(line[0]);
		int H = Integer.parseInt(line[1]);
		int W = Integer.parseInt(line[2]);

		double x = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));

		System.out.println((int)Math.floor(H*x) +" "+(int)Math.floor(W*x));
	}
}
