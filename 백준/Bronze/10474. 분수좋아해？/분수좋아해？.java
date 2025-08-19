import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		while(!line.equals("0 0")){
			int a = Integer.parseInt(line.split(" ")[0]);
			int b = Integer.parseInt(line.split(" ")[1]);

			sb.append(a/b).append(" ").append(a%b).append(" / ").append(b).append("\n");

			line = br.readLine();
		}

		System.out.println(sb.toString().trim());

	}
}
