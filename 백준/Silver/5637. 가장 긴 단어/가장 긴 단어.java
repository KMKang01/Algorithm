import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String longest = "";
		String word = sc.next();
		while(!word.equals("E-N-D")) {
			word = word.replaceAll("[^a-zA-Z-]", "");
			if (word.length() > longest.length()) {
				longest = word;
			}
			word = sc.next();
		}
		sc.close();
		System.out.println(longest.toLowerCase());

	}
}


