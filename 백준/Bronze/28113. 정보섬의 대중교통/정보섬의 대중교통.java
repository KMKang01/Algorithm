import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int A = Integer.parseInt(line[1]);
		int B = Integer.parseInt(line[2]);

			if( A > B) {
				System.out.println("Subway");
			} else if (A < B) {
				System.out.println("Bus");
			} else {
				System.out.println("Anything");
			}


	}
}
