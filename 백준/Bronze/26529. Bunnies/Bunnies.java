import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			long result = 0;
			int x = Integer.parseInt(br.readLine());
			long pp = 1;
			long p = 1;
			if (x == 0) result = 1;
			if (x == 1) result = 1;
			for (int j = 2; j <= x; j++) {
				result = pp + p;
				pp = p;
				p = result;
			}
			System.out.println(result);
		}

	}
}
