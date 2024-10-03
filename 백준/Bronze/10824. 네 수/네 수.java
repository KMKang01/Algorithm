import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		String [] input = br.readLine().split(" ");
		sb1.append(input[0]).append(input[1]);
		sb2.append(input[2]).append(input[3]);

		long a = Long.parseLong(sb1.toString());
		long b = Long.parseLong(sb2.toString());

		System.out.println(a + b);
	}
}