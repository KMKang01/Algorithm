import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] line = br.readLine().split(" ");
		boolean isRated = false;
		for (String s : line) {
			if(s.contains("D2")||s.contains("d2")) isRated = true;
		}

		if(isRated) System.out.println("D2");
		else System.out.println("unrated");
	}
}