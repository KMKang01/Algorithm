import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int M = Integer.parseInt(line1[1]);

		String [] line2 = br.readLine().split(" ");
		String [] line3 = br.readLine().split(" ");

		int max1 = 0;
		int max2 = 0;

		for(String a: line2) {
			max1 = Math.max(max1, Integer.parseInt(a));
		}
		for(String a: line3) {
			max2 = Math.max(max2, Integer.parseInt(a));
		}

		System.out.println(max1 + max2);
	}
}