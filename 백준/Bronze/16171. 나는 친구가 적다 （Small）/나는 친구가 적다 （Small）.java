import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		s1 = s1.replaceAll("[0-9]", "");
		System.out.println(s1.contains(s2) ? "1": "0");
	}
}


