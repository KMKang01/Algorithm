import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String line = br.readLine();
			if(line.equals("0 0 0")) break;

			int a1 = Integer.parseInt(line.split(" ")[0]);
			int a2 = Integer.parseInt(line.split(" ")[1]);
			int a3 = Integer.parseInt(line.split(" ")[2]);

			if(a2 - a1 == a3 - a2) {
				sb.append("AP ").append(a3 + (a2 - a1)).append("\n");
			} else if (a2 / a1 == a3 / a2) {
				sb.append("GP ").append(a3 * (a2 / a1)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}