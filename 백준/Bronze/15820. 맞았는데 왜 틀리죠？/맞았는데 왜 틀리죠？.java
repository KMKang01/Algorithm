import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		String[] line = br.readLine().split(" ");
		int s1 = Integer.parseInt(line[0]);
		int s2 = Integer.parseInt(line[1]);

		boolean isSamGood = true;

		for (int i = 0; i < s1; i++) {
			String[] tc = br.readLine().split(" ");

			int sam = Integer.parseInt(tc[0]);
			int my = Integer.parseInt(tc[1]);

			if (sam != my) isSamGood = false;
		}

		boolean isSysGood = true;

		for (int i = 0; i < s2; i++) {
			String[] tc = br.readLine().split(" ");

			int sys = Integer.parseInt(tc[0]);
			int my = Integer.parseInt(tc[1]);

			if (sys != my) isSysGood = false;
		}

		if (isSamGood && isSysGood) {
			System.out.println("Accepted");
		} else if (!isSamGood) {
			System.out.println("Wrong Answer");
		} else if (isSamGood && !isSysGood) {
			System.out.println("Why Wrong!!!");
		}

	}
}