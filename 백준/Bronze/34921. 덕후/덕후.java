import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line = br.readLine().split(" ");
		int P = 10 + 2 * (25 - Integer.parseInt(line[0]) + Integer.parseInt(line[1]));
		System.out.println(P >= 0 ? P : 0);
	}
}