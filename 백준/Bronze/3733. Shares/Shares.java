import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		while((line = br.readLine()) != null) {
			String [] parts = line.split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			sb.append(b/(a+1)).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
