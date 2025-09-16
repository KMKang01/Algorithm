import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line[] = br.readLine().split(" ");
		int e = Integer.parseInt(line[0]);
		int f = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);

		int count = 0;
		e += f;
		while(e > c - 1) {
			e -= c;
			e++;
			count++;
		}

		System.out.println(count);
	}
}