import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		String line = br.readLine();
		while (!line.equals("0 0 0 0")) {
			String[] tokens = line.split(" ");
			int min = Integer.parseInt(tokens[2]) - Integer.parseInt(tokens[1]);
			int max = Integer.parseInt(tokens[3]) - Integer.parseInt(tokens[0]);
			sb1.append(min + " " + max + "\n");
			line = br.readLine();
		}
		System.out.println(sb1.toString().trim());

	}
}