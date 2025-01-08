import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean isWhat = false;
		for (int i = 0; i < N ; i++) {
			String line  = br.readLine();
			if(line.equals("anj")) isWhat = true;
		}
		if(isWhat) System.out.println("뭐야;");
		else System.out.println("뭐야?");
	}
}