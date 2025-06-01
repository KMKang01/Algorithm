import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] id = br.readLine().split("");
		String line = br.readLine();

		for(String s : id) {
			line = line.replace(s, "");
		}

		System.out.println(line);

	}
}

