import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		String line = br.readLine();
		while(!line.equals("***")){
			StringBuilder sb2 = new StringBuilder();
			sb2.append(line);
			sb2.reverse();
			sb1.append(sb2).append("\n");
			line = br.readLine();
		}
		System.out.println(sb1.toString().trim());
	}
}