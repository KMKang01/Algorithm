import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int canRead = 0;
		for (int i = 0; i < 9; i++) {
			canRead += Integer.parseInt(br.readLine());
		}
		System.out.println(total - canRead);

	}
}