import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String [] lines = br.readLine().split(" ");

		int maxStrick = 0;
		int currentStrick = 0;
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(lines[i]);
			if( n > 0) {
				currentStrick++;
			} else {
				maxStrick = Math.max(maxStrick, currentStrick);
				currentStrick = 0;
			}
		}
		maxStrick = Math.max(maxStrick, currentStrick);
		System.out.println(maxStrick);
	}
}