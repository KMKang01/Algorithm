import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String killer ="";
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			boolean searched = false;
			for (String s : line.split("")) {
				if (s.equals("S")) {
					killer = line;
					searched = true;
					break;
				}
			}
			if(searched) break;
		}
		System.out.println(killer);
	}
}
