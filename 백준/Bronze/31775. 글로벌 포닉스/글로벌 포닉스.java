import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line1 = br.readLine();
		String line2 = br.readLine();
		String line3 = br.readLine();

		char c1 = line1.charAt(0);
		char c2 = line2.charAt(0);
		char c3 = line3.charAt(0);

		boolean isK = false;
		boolean isL = false;
		boolean isP = false;

		if (c1 == 'k' || c2 == 'k' || c3 == 'k') isK = true;
		if (c1 == 'l' || c2 == 'l' || c3 == 'l') isL = true;
		if (c1 == 'p' || c2 == 'p' || c3 == 'p') isP = true;

		if(isK && isL && isP) System.out.println("GLOBAL");
		else System.out.println("PONIX");
	}
}
