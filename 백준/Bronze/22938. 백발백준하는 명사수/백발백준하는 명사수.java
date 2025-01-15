import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line1 = br.readLine().split(" ");
		String[] line2 = br.readLine().split(" ");

		int x1 = Integer.parseInt(line1[0]);
		int y1 = Integer.parseInt(line1[1]);
		int r1 = Integer.parseInt(line1[2]);
		int x2 = Integer.parseInt(line2[0]);
		int y2 = Integer.parseInt(line2[1]);
		int r2 = Integer.parseInt(line2[2]);

		if( Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) < r1 + r2 ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}


	}
}