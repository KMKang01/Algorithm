import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean isHacked = false;
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			if (
					line.equals("Never gonna give you up") ||
							line.equals("Never gonna let you down") ||
							line.equals("Never gonna run around and desert you") ||
							line.equals("Never gonna make you cry") ||
							line.equals("Never gonna say goodbye") ||
							line.equals("Never gonna tell a lie and hurt you") ||
							line.equals("Never gonna stop")
			){
				continue;
			} else isHacked = true;
		}
		if (isHacked) System.out.println("Yes");
		else System.out.println("No");

	}
}
